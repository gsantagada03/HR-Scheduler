package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

	
	@GetMapping("/login")
	public String login() {
		return "Login";
	}
	
	@GetMapping("/admin/resetPassword")
	public String resetPassword() {
		return "ResetPassword";
	}
	
}
	
