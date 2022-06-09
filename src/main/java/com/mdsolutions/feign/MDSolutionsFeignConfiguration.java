package com.mdsolutions.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Feign;

@Configuration
public class MDSolutionsFeignConfiguration {

	@Autowired
	RibbonLoadBalancerClient ribbonLoadBalancerClient;
	
	@Bean
	public Feign.Builder feignBuilder() {
		return Feign.builder();
	}
	
}
