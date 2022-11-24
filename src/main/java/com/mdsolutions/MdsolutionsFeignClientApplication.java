package com.mdsolutions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
@EnableFeignClients(basePackages = "com.mdsolutions.feign")
public class MdsolutionsFeignClientApplication {

	public static void main(String[] args) { 
		// this line am adding from Browser and updatng the same again
		// this line am updating from Eclipse
		SpringApplication.run(MdsolutionsFeignClientApplication.class, args);
	}

}
