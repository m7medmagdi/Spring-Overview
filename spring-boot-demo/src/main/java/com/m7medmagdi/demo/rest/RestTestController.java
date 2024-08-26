package com.m7medmagdi.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestTestController {
	
	 	@GetMapping("/")
	    public String sayHello() {
	        return "Hello  World! devtools";
	    }
}
