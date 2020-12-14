package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class DemoController {
	
	@RequestMapping("/hello")
	public String getDemoDetails() {
		return "Hello World Rohit";
	}

}
