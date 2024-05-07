package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * The Admin class represents an administrator entity in the system.
 */
@Entity
public class Admin {

	/**
	 * The unique identifier for the admin.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	/**
	 * The username of the admin. It must be unique.
	 */
	@Column(nullable = false, unique = true)
	private String username;

	/**
	 * The password of the admin.
	 */
	@Column(nullable = false)
	private String password;

	//Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
