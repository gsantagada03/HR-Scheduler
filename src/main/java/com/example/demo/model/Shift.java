package com.example.demo.model;


import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/**
 * The Shift class represents a shift entity for an employee in the system.
 */
@Entity
public class Shift {

    /**
     * The unique identifier for the shift.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * The employee associated with the shift.
     */
    @ManyToOne
    private Employee employee;

    /**
     * The start time of the shift.
     */
    @Column(nullable = false)
    private LocalTime startTime;

    /**
     * The end time of the shift.
     */
    @Column(nullable = false)
    private LocalTime endTime;

    /**
     * The date of the shift.
     */
    @Column(nullable = false)
    private LocalDate shiftDate;
    
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

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public LocalDate getShiftDate() {
		return shiftDate;
	}

	public void setShiftDate(LocalDate shiftDate) {
		this.shiftDate = shiftDate;
	}
	
	
}
