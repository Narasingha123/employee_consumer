package com.rest.springboot;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.rest.springboot.controller.EmployeeConsumerController;

@SpringBootApplication
public class EmployeeConsumerApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx =  SpringApplication.run(EmployeeConsumerApplication.class, args);
		
		
		EmployeeConsumerController	consumerController = ctx.getBean(EmployeeConsumerController.class);
		
		System.out.println(consumerController);
		
		consumerController.getEmployee();
		
		
	}

	
	
	@Bean
	public EmployeeConsumerController consumerController() {
		
		return new EmployeeConsumerController();
	}
}
