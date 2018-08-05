package com.fileio;

import java.io.File;
import java.util.Scanner;

public class fileExists {

	public static void main(String[] args) {
		
				//Taking the file path
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Enter the path of the file");
				String path = scanner.nextLine();

				File tmpDir = new File(path);
				
				//Checking if a file exists
				if(tmpDir.exists()) {
					System.out.println("File exists in the given path");
				}
				else
				{
					System.out.println("File does not exists");
				}


	}

}
