package com.example.demo.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.AdminService;

/**
 * The AdminAccountInitializer class implements CommandLineRunner and is used to ensure that an admin
 * account is available when the application starts. It interacts with the AdminService to perform this check.
 */
@Component
public class AdminAccountInitializer implements CommandLineRunner {

	@Autowired
	private AdminService adminService;

	/**
	 * Ensures that an admin account is available by calling the ensureAdminAccount method of AdminService.
	 * This method is executed automatically at application startup.
	 *
	 * @param args command-line arguments passed to the application.
	 * @throws Exception if an error occurs during the initialization.
	 */
	@Override
	public void run(String... args) throws Exception {
		adminService.ensureAdminAccount();
	}
}
