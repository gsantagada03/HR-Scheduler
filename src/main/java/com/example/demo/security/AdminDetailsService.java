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

@Service
public class AdminDetailsService implements UserDetailsService{
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Admin> admin = adminRepository.findByUsername(username);
		if(admin.isPresent()) {
			Admin adminOBJ = admin.get();
			return User.builder()
					.username(adminOBJ.getUsername())
					.password(adminOBJ.getPassword())
					.roles(adminOBJ.getRole())
					.build();
		}else {
			throw new UsernameNotFoundException(username);
		}
	}

	
}
