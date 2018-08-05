package com.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//The contents of the file are read and displayed in this class 
public class MyClassDeserializeTest {

	public static void main(String args[]) throws IOException, ClassNotFoundException {
		
		MyClass myClass;
		MyClass myClass1;
		MyClass myClass2;
		MyClass myClass3;
		MyClass myClass4;
		
		
		FileInputStream fis = new FileInputStream("myClass.asdf");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		myClass = (MyClass)ois.readObject();
		System.out.println(myClass);

		myClass1 = (MyClass)ois.readObject();
		System.out.println(myClass1);
		
		myClass2 = (MyClass)ois.readObject();
		System.out.println(myClass2);
		
		myClass3 = (MyClass)ois.readObject();
		System.out.println(myClass3);
		
		myClass4 = (MyClass)ois.readObject();
		System.out.println(myClass4);

		
	}
	
}
