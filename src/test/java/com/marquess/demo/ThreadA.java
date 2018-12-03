package com.marquess.demo;

import com.marquess.demo.service.RedisService;

public class ThreadA extends Thread {
    private RedisService service;

    public ThreadA(RedisService service) {
        this.service =service;
    }

    @Override
    public void run() {
        try {
            service.secKill();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
