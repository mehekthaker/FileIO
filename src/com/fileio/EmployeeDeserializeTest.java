package com.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

//Deserialization is done, an object is read from the file and displayed
public class EmployeeDeserializeTest {

	public static void main(String[] args) {
		Employee employee;
		
		try {
			
			FileInputStream fis = new FileInputStream("emp.asdf");
			ObjectInputStream ois = new ObjectInputStream(fis);
			employee = (Employee)ois.readObject();
			System.out.println(employee);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
