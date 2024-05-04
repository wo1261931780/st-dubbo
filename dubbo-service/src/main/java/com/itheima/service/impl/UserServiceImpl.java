package com.itheima.service.impl;

import com.itheima.service.UserService;
import org.springframework.stereotype.Service;


/**
 * @author junw
 * 如果是单体启动，就需要service，因为需要作为一个bean进行管理。
 * 但是作为分布式项目，就需要发布出来，公共自己的端口和通信
 * 将对象创建出来，然后放到ioc容器中，通过注解@Service将其注册为一个服务，
 * 然后在xml中配置dubbo的协议、地址、版本等信息，就可以通过dubbo远程调用了。
 */
// @Service
@Service
public class UserServiceImpl implements UserService {
	// 使用dubbo的注解，将该类注册为一个dubbo的服务，并暴露出去
	// 主要是暴露给注册中心
	@Override
	public String sayHello() {
		return "hello dubbo!~";
	}
}
