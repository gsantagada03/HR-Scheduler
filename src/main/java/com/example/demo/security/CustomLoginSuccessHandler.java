package com.example.demo.security;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;

import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
import com.example.demo.service.AdminService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CustomLoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	AdminService adminService;

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
		String username = authentication.getName();
		if (authentication.getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN"))) {
			Optional<Admin> admin = adminRepository.findByUsername(username);
			if(admin.isPresent()) {
				Admin adminObj = admin.get();
				if(adminObj.getIsFirstLogin()) {
							setDefaultTargetUrl("/admin/resetPassword");
				}else {
					setDefaultTargetUrl("/admin/homePage");
				}
			} else {
				setDefaultTargetUrl("/user/profile");
			}
		}

		super.onAuthenticationSuccess(request, response, authentication);
	}

}
