package com.taskmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({ "com.taskmanager"})
public class TaskManagerApplication {
	
	@Autowired
	ApplicationContext applicationContext;
	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
		
		
	}

}
