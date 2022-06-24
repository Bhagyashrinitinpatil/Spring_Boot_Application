/**
 * 
 */
package com.batch91.model;

import javax.persistence.Entity;
import javax.persistence.Id;



/**
 * @author BHAGYASHRI
 *
 */

@Entity
public class Employee {

	@Id
	private int empId;
	private String empName;
	private double salary;
	

	public Employee() {
		super();
	}
	
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
