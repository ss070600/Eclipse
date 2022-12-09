package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${spring.application.user}")
	String user;

	@GetMapping("/task")
	public String doTask() {
		return "task completed by : " + user;
	}
}
