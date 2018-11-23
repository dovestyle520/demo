package com.marquess.demo.rabbitMQ;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver1 {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receive1 : " + hello);
    }
}
