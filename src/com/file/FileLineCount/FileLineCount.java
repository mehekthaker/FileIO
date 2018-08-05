package com.file.FileLineCount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileLineCount {

	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter the file path");
		Scanner scanner = new Scanner(System.in);
		String path = scanner.nextLine();
		
		//Used in order to read the line instead of a byte
		BufferedReader reader = new BufferedReader(new FileReader(path));
		int lineCount = 0;
		
		//Reads the line from the file
		while(reader.readLine()!=null)
		{
			lineCount++;	//Increments when one line is read 
		}
		reader.close();
		System.out.println("The number of lines in the file specified is "+lineCount);
	}
	
}
