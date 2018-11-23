package com.marquess.demo.controller;

import com.marquess.demo.rabbitMQ.HelloReceiver1;
import com.marquess.demo.rabbitMQ.HelloSender1;
import com.marquess.demo.rabbitMQ.HelloSender2;
import com.marquess.demo.rabbitMQ.UserSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class RabbitTestController {
    @Autowired
    private HelloSender1 helloSender1;
    @Autowired
    private HelloSender2 helloSender2;
    @Autowired
    private UserSender userSender;
    @Autowired
    private HelloReceiver1 helloReceiver1;

    @RequestMapping("/hello")
    public void hello() {
        helloSender1.send("233");
    }

    @RequestMapping("/oneToMany")
    public void oneToMany() {
        for(int i = 0; i < 10; i++) {
            helloSender1.send("msg"+i);
        }

    }

    @RequestMapping("/manyToMany")
    public void manyToMany() {
        for(int i = 0; i < 10; i++) {
            helloSender1.send("msg1"+i);
            helloSender2.send("msg2"+i);
        }

    }

    @RequestMapping("/userTest")
    public void userTest() {
        userSender.send();
    }
}
