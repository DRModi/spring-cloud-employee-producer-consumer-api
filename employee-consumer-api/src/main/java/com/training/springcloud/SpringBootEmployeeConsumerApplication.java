package com.training.springcloud;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.training.springcloud.controller.ConsumerControllerClient;

@SpringBootApplication
public class SpringBootEmployeeConsumerApplication {

	@Autowired
	ConsumerControllerClient consumerClient;

	public static void main(String[] args) throws RestClientException,
			IOException {

		ApplicationContext ctx = SpringApplication.run(
				SpringBootEmployeeConsumerApplication.class, args);

		ConsumerControllerClient consumerClient = ctx
				.getBean(ConsumerControllerClient.class);
		// 

		System.out.println("############## Service Response :  ========>     ");
		System.out.println(consumerClient);
		consumerClient.getEmployee();
		System.out.println("   ######################");

	}

}
