package com.fileio;

import java.io.Serializable;

//Implements Serializable interface and getters for the fields along with the parameterized constructor
public class MyClass implements Serializable{
	
	private String myName;
	private int myAge;
	
	
	public MyClass(String myName, int myAge) {
		super();
		this.myName = myName;
		this.myAge = myAge;
	}
	
	
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	
	public int getMyAge() {
		return myAge;
	}
	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}
	
	
	@Override
	public String toString() {
		return "MyClass [myName=" + myName + ", myAge=" + myAge + "]";
	}
	
	
	
}
