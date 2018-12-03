package com.marquess.demo.service;

import com.marquess.demo.common.lock.DistributedLock;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisService {
    private static JedisPool pool = null;

    static {
        JedisPoolConfig config = new JedisPoolConfig();

        config.setMaxTotal(200);

        config.setMaxIdle(8);

        config.setMaxWaitMillis(100 * 1000);

        config.setTestOnBorrow(true);

        pool = new JedisPool(config, "127.0.0.1", 6379, 3000);
    }

    DistributedLock lock = new DistributedLock(pool);

    int n = 500;

    public void secKill() throws InterruptedException {
        //返回锁的value值，供释放锁时候进行判断
        String indentigier = lock.lockWithTimeout("resource", 5000, 1000);
        System.out.println(Thread.currentThread().getName() + "获得了锁");
        System.out.println(--n);
        Thread.sleep(1000);
        lock.releaseLock("resource", indentigier);
    }
}
