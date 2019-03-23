package com.cgy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/member")
	public String member() {
		return "我是member端的服务信息 ："+port;
	}
}
