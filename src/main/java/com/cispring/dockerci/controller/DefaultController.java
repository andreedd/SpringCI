
package com.cispring.dockerci;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DefaultController {
    
	@RequestMapping("/welcome")
	public String helloWorld() {
 
		return "Hello world";
	}
}
