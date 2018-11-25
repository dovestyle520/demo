package com.marquess.demo.rabbitMQ;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send() {
        String msg = "fanoutSender : hello i am hou";
        System.out.println(msg);
        rabbitTemplate.convertAndSend("fanoutExchange", "abcd.ee", msg);
    }
}
