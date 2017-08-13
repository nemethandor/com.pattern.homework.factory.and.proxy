package com.pattern.homework.heroes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public String readWithScanner(String fileName) {
		File file;
		String line = null;
		try {
			file = new File(fileName + ".txt");
			Scanner scnr = new Scanner(file);
			line = scnr.nextLine();
			scnr.close();
		} catch (FileNotFoundException ex) {
			System.out.println("File not found. Please check the filename or place. " + ex.toString());
		}
		return line;
	}
}
