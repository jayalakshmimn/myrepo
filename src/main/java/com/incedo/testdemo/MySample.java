package com.incedo.testdemo;

import java.io.Serializable;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.incedo" })
public class MySample extends SpringBootServletInitializer implements Serializable
{
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(MySample.class);
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder)
	{
		System.out.println("Hello JENKINS Latest one");
		return springApplicationBuilder.sources(MySample.class);
	}
	public static void main(String[] args)
	{
		SpringApplication.run(MySample.class, args);
		logger.info("Its Aaaaaaaaaaaashis here git testing");
		logger.info("Server started at " + Calendar.getInstance().getTime());
		
	}
}

