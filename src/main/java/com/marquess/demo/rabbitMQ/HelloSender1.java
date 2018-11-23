package com.marquess.demo.rabbitMQ;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender1 {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String hello) {
        String sendMsg = hello + " " + new Date();
        System.out.println("Sender1 :" + sendMsg);
        this.rabbitTemplate.convertAndSend("hello", sendMsg);
    }
}
