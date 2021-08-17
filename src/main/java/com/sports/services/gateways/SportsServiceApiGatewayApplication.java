package com.sports.services.gateways;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SportsServiceApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportsServiceApiGatewayApplication.class, args);
	}

}
