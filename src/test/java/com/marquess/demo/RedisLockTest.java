package com.marquess.demo;

import com.marquess.demo.service.RedisService;

public class RedisLockTest {

    public static void main(String[] args) {
        RedisService service = new RedisService();
        for(int i= 0; i < 50; i++) {
            ThreadA threadA = new ThreadA(service);
            threadA.start();
        }
    }
}
