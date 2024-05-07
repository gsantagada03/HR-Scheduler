package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * The HRManager class represents a human resources manager entity in the system.
 */
@Entity
public class HRManager {

    /**
     * The unique identifier for the HR manager.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * The first name of the HR manager.
     */
    @Column(nullable = false)
    private String firstName;

    /**
     * The last name of the HR manager.
     */
    @Column(nullable = false)
    private String lastName;

    /**
     * The email address of the HR manager.
     */
    @Column(nullable = false)
    private String email;

    /**
     * The password of the HR manager.
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
