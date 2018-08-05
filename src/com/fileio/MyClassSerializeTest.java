package com.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Creates a list of 5 objects which are then written to the file
public class MyClassSerializeTest {
	
	public static void main(String args[]) {
		ArrayList<MyClass> list = new ArrayList<>();
		
		list.add(new MyClass("Ryan", 30));
		list.add(new MyClass("Ron", 23));
		list.add(new MyClass("Diana", 44));
		list.add(new MyClass("John", 55));
		list.add(new MyClass("Rose", 26));
		
		try {
			FileOutputStream fos = new FileOutputStream("myClass.asdf");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(MyClass mc: list)
				oos.writeObject(mc);
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}

}
