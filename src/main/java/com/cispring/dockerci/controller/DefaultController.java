package com.cispring.dockerci.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DefaultController {
    
	@RequestMapping("/")
	public String helloWorld() {
 
		return "Hello worldsss";
	}
}
