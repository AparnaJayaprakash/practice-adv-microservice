package com.example.helloservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class HelloServer {
	
	@GetMapping("/hey")
	public String hai() {
		return "Welcome here..!!!";
	}
	
	

}
