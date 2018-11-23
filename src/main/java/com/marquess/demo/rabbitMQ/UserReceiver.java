package com.marquess.demo.rabbitMQ;

import com.marquess.demo.vo.UserVO;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "user")
public class UserReceiver {
    @RabbitHandler
    public void process(UserVO userVO) {
        System.out.println("user receive  : " + userVO.getName()+"/"+userVO.getPass());
    }
}
