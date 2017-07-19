package com.incedo.testdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@RequestMapping("restAPi")
	public String message()
	{
		return "Welcome to REST API World >>>>>>>>>>Jenkins ";
	}
}
