package com.project.group4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Group4ProjectServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Group4ProjectServerApplication.class, args);
	}

}
