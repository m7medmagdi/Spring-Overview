package com.m7medmagdi.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestTestController {
	
	 	@GetMapping("/")
	    public String sayHello() {
	        return "Hello  World! actuator";
	    }
	 	@GetMapping("/hello1")
	    public String sayHello1() {
	        return "Hello  World! actuator 1";
	    }
	 	@GetMapping("/hello2")
	    public String sayHello2() {
	        return "Hello  World! actuator 2";
	    }
}
