package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


/**
 * The Employee class represents an employee entity in the system.
 */
@Entity
public class Employee {

    /**
     * The unique identifier for the employee.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * The role of the employee.
     */
    @Column(nullable = false)
    private String role;

    /**
     * The first name of the employee.
     */
    @Column(nullable = false)
    private String firstName;

    /**
     * The last name of the employee.
     */
    @Column(nullable = false)
    private String lastName;

    /**
     * The email address of the employee. It must be unique.
     */
    @Column(nullable = false, unique = true)
    private String email;

    /**
     * The password of the employee.
     */
    @Column(nullable = false)
    private String password;

    /**
     * The department of the employee.
     */
    @Column(nullable = false)
    private String department;

    /**
     * The phone number of the employee. It must be unique.
     */
    @Column(nullable = false, unique = true)
    private String phoneNumber;

    /**
     * The IBAN of the employee. It must be unique.
     */
    @Column(nullable = false, unique = true)
    private String iban;

    /**
     * The salary of the employee.
     */
    @Column(nullable = false)
    private int salary;
    
    //Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


}
