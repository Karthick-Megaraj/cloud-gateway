package com.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	
	@GetMapping("/employeeServiceFallBack")
	public String employeeServiceFallBackMethod() {
		return "Employee Service taking longer than expected."
				+ "Please try again!";
	}
	
	@GetMapping("/hrServiceFallBack")
	public String hrServiceFallBackMethod() {
		return "HR Service taking longer than expected."
				+ "Please try again!";
	}

}
