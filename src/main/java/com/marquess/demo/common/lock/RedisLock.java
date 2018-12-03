package com.marquess.demo.common.lock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

public class RedisLock {
    private static Logger logger = LoggerFactory.getLogger(RedisLock.class);
    private RedisTemplate redisTemplate;
    private static final int DEFAULT_ACQUIRY_RESOLUTION_MILLIS = 100;

    private String lockKey;

    /**
     * 锁超时时间，防止线程在入锁以后，无限的执行等待
     */
    private int expireMsecs = 60 * 1000;

    /**
     * 锁等待时间，防止线程饥饿
     */
    private int timeoutMsecs = 10 * 1000;

    private volatile boolean locked =false;

    /**
     * Default 10000 msecs timeout,60000m secs expiration
     */
    public RedisLock(RedisTemplate redisTemplate, String  lockKey) {
        this.redisTemplate = redisTemplate;
        this.lockKey = lockKey + "_lock";
    }

    /**
     * Detail constructor with default lock expiration of 60000 msecs
     */
    public RedisLock(RedisTemplate redisTemplate, String lockKey, int timeoutMsecs) {
        this(redisTemplate, lockKey);
        this.timeoutMsecs = timeoutMsecs;
    }

    /**
     * Detailed constructor
     */
    public RedisLock(RedisTemplate redisTemplate, String lockKey, int timeoutMsecs, int expireMsecs) {
        this(redisTemplate, lockKey, timeoutMsecs);
        this.expireMsecs = expireMsecs;
    }

    /**
     * @return lock key
     */
    public String getLockKey() {
        return lockKey;
    }

    private String get(final String key) {
        Object obj = null;
        try {
            obj = redisTemplate.execute(new RedisCallback<Object>() {
                @Override
                public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                    StringRedisSerializer serializer = new StringRedisSerializer();
                    byte[] data = redisConnection.get(serializer.serialize(key));
                    redisConnection.close();
                    if(data == null) {
                        return null;
                    }
                    return serializer.deserialize(data);
                }
            });
        }
        catch (Exception e) {
            logger.error("get redis error, key:{}", key);
        }
        return obj != null ? obj.toString() : null;
    }

    private boolean setNX(final String key, final String value) {
        Object obj = null;
        try {
            obj = redisTemplate.execute(new RedisCallback<Object>() {
                @Override
                public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                    StringRedisSerializer serializer = new StringRedisSerializer();
                    Boolean success = redisConnection.setNX(serializer.serialize(key), serializer.serialize(value));
                    redisConnection.close();
                    return success;
                }
            });
        } catch (Exception e) {
            logger.error("setNX redis error, key : {}", key);
        }
        return obj != null ? (Boolean) obj : false;
    }

    private String getSet(final String key, final String value) {
        Object obj = null;
        try {
            obj = redisTemplate.execute(new RedisCallback<Object>() {
                @Override
                public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                    StringRedisSerializer serializer = new StringRedisSerializer();
                    byte[] ret = redisConnection.getSet(serializer.serialize(key), serializer.serialize(value));
                    redisConnection.close();
                    return serializer.deserialize(ret);
                }
            });
        } catch (Exception e) {
            logger.error("setNX redis error, key : {}", key);
        }
        return obj != null ? (String) obj : null;
    }

    /**
     * 获得锁
     * 实现思路:主要是使用了reids的setnx命令，缓存了锁
     * redis缓存的key是锁的key，所有的共享，value是锁到期时间
     * （注意：这里把过期时间放在value，没有时间上设置其超时时间）
     * 执行过程 ：
     * 1.通过setnx尝试设置某个key的值，成功（当前没有这个锁）则返回，成功获得锁
     * 2.锁已经存在则获取锁的到期时间，和当前时间比较，超时的话，则设置新的值
     * @return true if lock is acquired, false acquire timeouted
     * @throws InterruptedException in case of thread interruption
     */
    public synchronized boolean lock() throws InterruptedException {
        int timeout = timeoutMsecs;
        while(timeout >= 0) {
            long expries = System.currentTimeMillis() + expireMsecs + 1;
            String expriesStr = String.valueOf(expries);
            if(this.setNX(lockKey, expriesStr)) {
                locked = true;
                return true;
            }
            /* redis里的时间 */
            String currentValueStr = this.get(lockKey);
            if(currentValueStr != null && Long.parseLong(currentValueStr) <
            System.currentTimeMillis()) {
                /* 判断是否为空，不为空的情况下，如果被其他线程设置了值，则第二条件判断是过不去的 */
                String oldValueStr = this.getSet(lockKey, expriesStr);
                /** 获取上一个锁到期时间，并设置现在的锁到期时间
                 *  只有一个线程才能获取上一个线上的设置时间，因为jedis.getSet是同步的
                 */
                if(oldValueStr != null && oldValueStr.equals(currentValueStr)) {
                    /**
                     * 防止误删（覆盖，因为key相同）了他人的锁 这里达不到效果，这里值会被覆盖，但是因为什么相差了很少时间，所以可以接受
                     * 分布式的情况下：如果这个时候，多个线程都恰好执行到这里，但是只有一个线程的设置值和当前值相同，他才有权利获取锁
                     * lock acquired
                     */
                    locked = true;
                    return true;
                }
            }
            timeout -= DEFAULT_ACQUIRY_RESOLUTION_MILLIS;
            /**
             * 延迟100 毫秒,  这里使用随机时间可能会好一点,可以防止饥饿进程的出现,即,当同时到达多个进程,
             * 只会有一个进程获得锁,其他的都用同样的频率进行尝试,后面有来了一些进行,也以同样的频率申请锁,这将可能导致前面来的锁得不到满足.
             * 使用随机的等待时间可以一定程度上保证公平性
             */
            Thread.sleep(DEFAULT_ACQUIRY_RESOLUTION_MILLIS);
        }
        return false;
    }

    /**
     * Acquried lock release
     */
    public synchronized void unlock() {
        if(locked) {
            redisTemplate.delete(lockKey);
        }
    }

    /**
     * RedisLock lock = new RedisLock(redisTemplate, key, 10000, 20000);
     *  try {
     *             if(lock.lock()) {
     *                    //需要加锁的代码
     *                 }
     *             }
     *         } catch (InterruptedException e) {
     *             e.printStackTrace();
     *         }finally {
     *             //为了让分布式锁的算法更稳键些，持有锁的客户端在解锁之前应该再检查一次自己的锁是否已经超时，再去做DEL操作，因为可能客户端因为某个耗时的操作而挂起，
     *             //操作完的时候锁因为超时已经被别人获得，这时就不必解锁了。 ————这里没有做
     *             lock.unlock();
     *         }
     */



























}
