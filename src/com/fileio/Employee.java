package com.fileio;

import java.io.Serializable;

//Implements Serializable interface and provides getters and parameterized constructor

public class Employee implements Serializable{

	private String name;
	private int empId;
	
	
	
	public Employee(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}


	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}
	
	
	
}
