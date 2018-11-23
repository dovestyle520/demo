package com.marquess.demo.rabbitMQ;

import com.marquess.demo.vo.UserVO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send() {
        UserVO user = new UserVO();
        user.setName("ssa");
        user.setPass("12342");
        System.out.println("user send :" + user.getName()+
                ", " + user.getPass());
        rabbitTemplate.convertAndSend("user", user);
    }

}
