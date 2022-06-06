package com.mdsolutions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MdsolutionsFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdsolutionsFeignClientApplication.class, args);
	}

}
