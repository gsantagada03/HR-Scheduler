package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;

/**
 * The AdminService class provides business logic for admin-related operations.
 * It interacts with the AdminRepository and handles password encoding and verification.
 */
@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * Ensures that an admin account with the username "admin" exists.
     * If not, creates a new admin account with default credentials.
     */
    public void ensureAdminAccount() {
        Optional<Admin> admin = adminRepository.findByUsername("admin");
        if (admin.isEmpty()) {
            Admin newAdmin = new Admin();
            newAdmin.setUsername("admin");
            newAdmin.setPassword(passwordEncoder.encode("Admin"));
            newAdmin.setFirstLogin(true);
            adminRepository.save(newAdmin);
        }
    }

    /**
     * Verifies if the provided admin password meets the specified regex requirements.
     *
     * @param admin the admin object containing the password to verify.
     * @return true if the password meets the requirements, false otherwise.
     */
    public boolean verifyPassword(Admin admin) {
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if (!admin.getPassword().isEmpty()) {
            if (admin.getPassword().matches(passwordRegex)) {
                return true;
            } else {
                System.out.println("La password non rispetta i requisiti della regex");
                return false;
            }
        } else {
            System.out.println("La password non è presente.");
            return false;
        }
    }

    /**
     * Changes the admin's password during the first login if it meets the requirements
     * and matches the confirmation password.
     *
     * @param adminNewPassword the admin object containing the new password.
     * @param confirmPassword the confirmation password entered by the user.
     * @return true if the password is successfully changed, false otherwise.
     * @throws UsernameNotFoundException if the admin user is not found.
     */
    public boolean changeAdminPasswordFirstLogin(Admin adminNewPassword, String confirmPassword) {
        Optional<Admin> adminOptional = adminRepository.findByUsername("admin");
        if (adminOptional.isPresent()) {
            Admin adminObj = adminOptional.get();
            if (verifyPassword(adminNewPassword) && adminNewPassword.getPassword().equals(confirmPassword)) {
                String encodedPassword = passwordEncoder.encode(adminNewPassword.getPassword());
                adminObj.setPassword(encodedPassword);
                System.out.println("Password modificata con successo");
                adminObj.setFirstLogin(false);
                adminRepository.save(adminObj);
                return true;
            } else {
                System.out.println("Errore durante la modifica della password");
                return false;
            }
        } else {
            throw new UsernameNotFoundException("admin");
        }
    }
}
