package com.example.demo.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;

/**
 * The AdminDetailsService class implements UserDetailsService and is used to load user-specific data.
 * It interacts with the AdminRepository to fetch admin details based on the username.
 */
@Service
public class AdminDetailsService implements UserDetailsService {
    
    @Autowired
    private AdminRepository adminRepository;

    /**
     * Loads the user details by username.
     *
     * @param username the username of the admin to load.
     * @return UserDetails containing the admin's information.
     * @throws UsernameNotFoundException if no admin is found with the given username.
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Admin> admin = adminRepository.findByUsername(username);
        if (admin.isPresent()) {
            Admin adminOBJ = admin.get();
            return User.builder()
                    .username(adminOBJ.getUsername())
                    .password(adminOBJ.getPassword())
                    .roles(adminOBJ.getRole())
                    .build();
        } else {
            throw new UsernameNotFoundException(username);
        }
    }
}
