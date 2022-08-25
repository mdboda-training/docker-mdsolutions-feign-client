package com.mdsolutions.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mdsolutions.dto.UserDto;

@FeignClient(name = "mdsolutions-rest-service-provider")
//@RibbonClient(name = "mdsolutions-rest-service-provider")
//@EnableDiscoveryClient
public interface UserFeignClient {
	
	@GetMapping("/user/getUsers")
	public UserDto getUsers(@RequestParam Integer userId);

	@GetMapping("/user/getAllUsers")
	public List<UserDto> getUsers();

	/*
	 * @GetMapping("/user/deleteUser") public String getDeleteUser(Integer userId);
	 * 
	 * @PostMapping("/user/createUser") public UserDto createUser(UserDto userDto) ;
	 */
	
}
