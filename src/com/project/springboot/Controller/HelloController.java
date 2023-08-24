package com.project.springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
		
@GetMapping("/")//same as @RequestMapping(value="/",method=RequestMethod.GET)	
public String helloWorld() {
	return "Welcome to my new webpage";
}
}
// command to run using terminal D:\Juliet's Files\springboot\springboot>mvn spring-boot:run
//project→Maven build→in goals type⇒spring-boot:run apply and run