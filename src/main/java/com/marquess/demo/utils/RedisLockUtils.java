package com.marquess.demo.utils;

public class RedisLockUtils {
    private String lockKey;
    private int expireMsecs = 60 * 1000;

    private int timeoutMsecs = 10 * 1000;

    private volatile boolean locked = false;


}
