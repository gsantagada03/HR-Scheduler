package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public void ensureAdminAccount() {
		Optional<Admin> admin = adminRepository.findByUsername("admin");
		if(admin.isEmpty()) {
			Admin newAdmin = new Admin();
			newAdmin.setUsername("admin");
			newAdmin.setPassword(passwordEncoder.encode("Admin"));
			newAdmin.setFirstLogin(true);
			adminRepository.save(newAdmin);
		}
	}
	
	
	public boolean adminFirstLogin(Admin newAdminCredentials) throws UsernameNotFoundException{
		Optional<Admin> adminOptional = adminRepository.findByUsername("admin");
		Admin admin = adminOptional.get();
		if(adminOptional.isPresent()) {
			if(admin.getIsFirstLogin()) {
				admin.setPassword(passwordEncoder.encode(newAdminCredentials.getPassword()));
				admin.setFirstLogin(false);
				adminRepository.save(admin);
				System.out.println("Password modificata con successo");
				return true;
			}else {
				return false;
			}
		}else {
			throw new UsernameNotFoundException("admin");
		}
	}
}
