package com.marquess.demo.rabbitMQ;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send() {
        String msg1 = "I am topic.message msg=====";
        System.out.println("sender1 : " + msg1);
        rabbitTemplate.convertAndSend("exchange", "topic.message", msg1);

        String msg2 = "I am topic.messages msg#########";
        System.out.println("sender2 : " + msg2);
        rabbitTemplate.convertAndSend("exchange", "topic.message", msg2);
    }
}
