package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Audit {
	private Account account;

	public static void main(String[] args) throws IOException {
		File audit = new File("Log.txt");
		FileWriter writeTo = new FileWriter(audit);
		try {
			PrintWriter output = new PrintWriter(writeTo);

			output.println();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
