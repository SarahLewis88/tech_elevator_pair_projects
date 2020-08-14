package com.techelevator;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class FindAndReplace {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Please enter the name of the original file.");
		
		Scanner fileAsInput = new Scanner(System.in); 
		String fileAsString = fileAsInput.next();
		File fileAsFile = new File(fileAsString); 
		
		System.out.println("Please enter the name of the destination file.");
		
		Scanner destinationFileAsInput = new Scanner(System.in); // input should be copied_file.txt
		String destinationFileAsString = destinationFileAsInput.next(); 
		File destinationFileAsFile = new File(destinationFileAsString);
		
		if (destinationFileAsString.equals("copied_file.txt")) {
			System.out.println("Valid file!");
		}
		else {
			System.out.print("File is invalid.");
			System.exit(0);
		}
		
		FileWriter writeTo = new FileWriter(destinationFileAsFile);
	
		System.out.println("Please enter the word you want to replace.");
		
		Scanner wordAsInput = new Scanner(System.in);
		String wordAsString = wordAsInput.next().toLowerCase();
		
		System.out.println("Please enter replacment.");
		
		Scanner replacmentWordAsInput = new Scanner(System.in);
		String replacmentWordAsString = replacmentWordAsInput.next();
		
		try (Scanner newScanner = new Scanner(fileAsFile); 
				PrintWriter output = new PrintWriter(destinationFileAsFile)) {

			while(newScanner.hasNextLine()) {
				String line = newScanner.nextLine();
				output.println(line.replaceAll("(?i)" + wordAsString, replacmentWordAsString));
			}
			writeTo.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
