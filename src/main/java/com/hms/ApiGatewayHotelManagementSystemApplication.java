package com.hms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class ApiGatewayHotelManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayHotelManagementSystemApplication.class, args);
	}

}
