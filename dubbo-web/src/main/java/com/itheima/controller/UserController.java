package com.itheima.controller;

import com.itheima.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author junw
 */
@RestController
@RequestMapping("/user")
public class UserController {

	// 注入Service
	// @Autowired// 如果进行过分布式改造，这里需要修改为远程注解
	@Reference
	private UserService userService;


	@RequestMapping("/sayHello")
	public String sayHello() {
		return userService.sayHello();
	}

}
