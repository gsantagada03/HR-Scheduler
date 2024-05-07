package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/**
 * The Holiday class represents a holiday entity for an employee in the system.
 */
@Entity
public class Holiday {

    /**
     * The unique identifier for the holiday.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * The employee associated with the holiday.
     */
    @ManyToOne
    private Employee employee;

    /**
     * The start date of the holiday.
     */
    @Column(nullable = false)
    private LocalDate startDate;

    /**
     * The end date of the holiday.
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
