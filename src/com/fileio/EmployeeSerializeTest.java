package com.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Serialization is done, an object is written to a file
public class EmployeeSerializeTest {

	public static void main(String args[]) {

		Employee employee = new Employee("Mehek", 1553);

		try {
			
			FileOutputStream fos = new FileOutputStream("emp.asdf");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
