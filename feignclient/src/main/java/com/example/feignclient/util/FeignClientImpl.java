package com.example.feignclient.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="feigncleint",url="localhost:8091/student")
public interface FeignClientImpl {
	
	@GetMapping("/name")
	public String getName();
	
	@GetMapping("/address")
	public String getAddress();
	
	@GetMapping("/status")
	public String getStatus();

}
