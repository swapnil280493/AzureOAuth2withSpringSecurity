package com.example.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	@RequestMapping("/")
	public String home() {
		
		return "Successfully logged in";
	}
}
