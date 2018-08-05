package com.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws IOException{
		
			//Accepting file path
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the path of the file");
			String path = scanner.nextLine();

			//counting words
			String line;
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			int wordCount = 0;
			
			//Splits the word using space delimiter, stores in an array and then the array length gives the word count
			while((line = reader.readLine()) != null) {
				String[] wordList = line.split("\\s+");
				wordCount += wordList.length;
			}
			reader.close();

			//Displaying number of words
			System.out.println(wordCount + " words");
		}


}


