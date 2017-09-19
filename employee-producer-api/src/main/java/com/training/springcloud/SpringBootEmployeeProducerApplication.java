package com.training.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient //For Service Registry
@EnableCircuitBreaker //For Hystrix FallBack Method
public class SpringBootEmployeeProducerApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootEmployeeProducerApplication.class, args);

	}

}
