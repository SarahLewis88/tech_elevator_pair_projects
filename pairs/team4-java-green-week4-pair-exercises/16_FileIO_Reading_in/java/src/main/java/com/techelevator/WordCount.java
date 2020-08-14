package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {

		File fileName = new File("alices_adventures_in_wonderland.txt");
		
		try (Scanner newScanner = new Scanner(fileName)) {
			
			int wordCount = 0;
			int sentenceCount = 0;
			while(newScanner.hasNextLine()) {
				//word count
				String line = newScanner.nextLine();
				String[] words = line.split(" ");
				for (String s : words) {
					if (s.isEmpty()) {
						continue;
					}
					wordCount++;
				}
				
				//sentence count
				String[] sentences = line.split(" ");
				for (String s : sentences) {
					if (s.contains("!") || s.contains(".") || s.contains("?")) {
						sentenceCount++;
					}
				}
			}	
			System.out.println(wordCount);
			System.out.println(sentenceCount);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
