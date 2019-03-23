package com.cgy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaOrderApplication.class, args);
	}

}
