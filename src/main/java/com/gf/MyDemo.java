package com.gf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyDemo {
	@RequestMapping("/")
	public String index(){
		return "hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyDemo.class, args);
	}
}
