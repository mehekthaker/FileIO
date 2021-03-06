package com.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class fileGrep {

	public static void main(String[] args) throws IOException {
		
		int lineCount=0,flag=0;

		//Takes the file path as user input
		System.out.println("Enter the file path");
		Scanner scanner = new Scanner(System.in);
		
		//Takes the string to be searched from the user
		String path = scanner.nextLine();
		System.out.println("Enter the string to be searched");
		String string = scanner.nextLine();
		
		File file = new File(path);
		
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		String line;
		
		//Reads the line and counts the line also checks if the string which is to be searched is found or not
		while((line=br.readLine()) != null) {
			lineCount++;
			
			if(line.contains(string)) {
				flag=1;
				System.out.println("Line number: "+lineCount+" || Line: "+line);
			}
		}
		if(flag==0)
			System.out.println("String "+string+" not found");
	}
	
}
