package com.example.student.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/name")
	public String name() {
		return "Hi Taniya!";
	}
	
	@GetMapping("/address")
	public String address() {
		return "Taniya stays in Kottayam";
	}
	
	@GetMapping("/status")
	public String status() {
		return "Taniya is active";
	}
	

}
