package com.example.demo.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.AdminService;

@Component
public class AdminAccountInitializer implements CommandLineRunner {

	@Autowired
	private AdminService adminService;
	

	@Override
	public void run(String... args) throws Exception {
		adminService.ensureAdminAccount();
	}
}
