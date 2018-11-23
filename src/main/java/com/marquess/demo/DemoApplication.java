package com.marquess.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan({"com.marquess.demo.dao","com.marquess.demo.daoEX"})
public class DemoApplication {
//	@Bean
//	public Queue helloQueue() {
//		return new Queue("hello");
//	}
//
//	@Bean
//	public Queue userQueue() {
//		return new Queue("user");
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
