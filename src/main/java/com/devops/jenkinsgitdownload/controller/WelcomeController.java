package com.devops.jenkinsgitdownload.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/welcome")
	public String getMessages()
	{
		return "welcome to my website";
	}
	
	

}
