package com.example.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Employee implements Serializable{
	
	private static final long serialVersionUID = -598988534;
	private String empId;
	private String empName;
	
	public Employee() {
		
	}
	
	public Employee(String empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
	
}
