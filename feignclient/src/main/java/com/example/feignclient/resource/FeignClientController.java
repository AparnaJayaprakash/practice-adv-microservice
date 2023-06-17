package com.example.feignclient.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feignclient.util.FeignClientImpl;

@RestController
@RequestMapping("/client")
public class FeignClientController {
	
	@Autowired
	FeignClientImpl feignclientimpl;
	
	@GetMapping("/name_student")
	public String studentName() {
		return feignclientimpl.getName();
	}
	
	@GetMapping("/address_student")
	public String studentAddress() {
		return feignclientimpl.getAddress();
	}
	
	@GetMapping("/status_student")
	public String studentStatus() {
		return feignclientimpl.getStatus();
	}

}
