package com.itheima.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

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
// 获取访问url，然后远程rpc调用，进而将其封装为代理对象，进行调用

	@RequestMapping("/sayHello")
	public String sayHello() {
		return userService.sayHello();
	}

}
