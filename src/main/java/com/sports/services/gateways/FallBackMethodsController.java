package com.sports.services.gateways;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodsController {
	
	@GetMapping("/fallBackMethodSportsService")
	public String fallBackMethodForSportsService() {
		return "The Service SPORTS you are trying to reach"+
	"is temporarly not available please try AGAIN";
	}
	
	@GetMapping("/fallBackMethodPlayerService")
	public String fallBackMethodForPlayerService() {
		return "The Service PLAYER you are trying to reach"+
	"is temporarly not available please try AGAIN";
	}

}
