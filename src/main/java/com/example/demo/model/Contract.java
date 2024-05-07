package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
/**
 * The Contract class represents a contract entity for an employee in the system.
 */
@Entity
public class Contract {

    /**
     * The unique identifier for the contract.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * The employee associated with the contract.
     */
    @OneToOne
    private Employee employee;

    /**
     * The type of the contract.
     */
    @Column(nullable = false)
    private String type;

    /**
     * The start date of the contract.
     */
    @Column(nullable = false)
    private LocalDate startDate;

    /**
     * The end date of the contract.
     */
    @Column(nullable = false)
    private LocalDate endDate;
    
    //Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
}
