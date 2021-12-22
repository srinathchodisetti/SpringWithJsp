package com.jsp.springjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jsp.springjsp")
public class SpringJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJspApplication.class, args);
	}

}
