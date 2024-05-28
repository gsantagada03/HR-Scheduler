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

/**
 * The CustomLoginSuccessHandler class extends SimpleUrlAuthenticationSuccessHandler and is used to handle 
 * actions upon successful authentication. It interacts with the AdminRepository and AdminService to 
 * determine the appropriate post-login behavior for admin users.
 */
@Component
public class CustomLoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    @Autowired
    AdminRepository adminRepository;

    @Autowired
    AdminService adminService;

    /**
     * Handles actions upon successful authentication. If the authenticated user is an admin and it is 
     * their first login, they are redirected to the password reset page. Otherwise, they are redirected 
     * to the admin home page.
     *
     * @param request the HttpServletRequest.
     * @param response the HttpServletResponse.
     * @param authentication the Authentication object containing user authentication details.
     * @throws IOException if an input or output error occurs during the handling.
     * @throws ServletException if a servlet-specific error occurs during the handling.
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        String username = authentication.getName();
        if (authentication.getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN"))) {
            Optional<Admin> admin = adminRepository.findByUsername(username);
            if (admin.isPresent()) {
                Admin adminObj = admin.get();
                if (adminObj.getIsFirstLogin()) {
                    setDefaultTargetUrl("/admin/resetPassword");
                } else {
                    setDefaultTargetUrl("/admin/homePage");
                }
            }
        }

        super.onAuthenticationSuccess(request, response, authentication);
    }
}
