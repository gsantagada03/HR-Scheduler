package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Admin;
import com.example.demo.service.AdminService;

/**
 * The AdminController class handles web requests related to admin functionalities such as login,
 * password reset, and password change. It interacts with the AdminService to perform these operations
 * and returns appropriate views based on the request.
 */
@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;

	/**
	 * Displays the login page. If an error parameter is present, an error message is added to the model.
	 *
	 * @param error an optional parameter indicating if there was an error during login.
	 * @param model used to add attributes to the model.
	 * @return the "Login" view.
	 */
	@GetMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error, Model model) {
		if (error != null) {
			model.addAttribute("errorMessage", "Username o password non validi");
		}
		return "Login";
	}

	/**
	 * Displays the password reset page.
	 *
	 * @return the "ResetPassword" view.
	 */
	@GetMapping("/admin/resetPassword")
	public String resetPassword() {
		return "ResetPassword";
	}

	/**
	 * Handles the password change request. If the password change is successful, a success message is added
	 * to the model and the user is redirected to the admin home page. If unsuccessful, the user is redirected
	 * back to the password reset page.
	 *
	 * @param adminNewPassword contains the new password information for the admin.
	 * @param confirmPassword the confirmation password entered by the user.
	 * @param model used to add attributes to the model.
	 * @return redirects to either "AdminHomePage" or "ResetPassword" based on the outcome.
	 */
	@PostMapping("/changePassword")
	public String changePassword(Admin adminNewPassword, String confirmPassword, Model model) {
		if (adminService.changeAdminPasswordFirstLogin(adminNewPassword, confirmPassword)) {
			model.addAttribute("successMessage", "Password modificata con successo");
			return "redirect:/admin/homePage";
		} else {
			return "redirect:/admin/resetPassword";
		}
	}

	/**
	 * Displays the admin home page.
	 *
	 * @return the "AdminHomePage" view.
	 */
	@GetMapping("/admin/homePage")
	public String adminHomePage() {
		return "AdminHomePage";
	}
	
	@PostMapping("/adminLogout")
	public String adminLogout() {
		return "redirect:/login";
	}
	
	@GetMapping("/admin/registerHRManager")
	public String registerHRManager() {
		return "CreateHRManager";
	}
}

