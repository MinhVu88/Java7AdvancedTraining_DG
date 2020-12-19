package com.lynda.javatraining;

import java.io.IOException;

import com.lynda.javatraining.exceptions.WrongFileException;
import com.lynda.javatraining.util.MyFileReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		String fileContents = MyFileReader.readFile("TextFile2.txt");
		
		System.out.println("\n" + fileContents);
		
		if (fileContents.equals("Right file")) {
			System.out.println("\nyou chose the right file");
		
		} else {
			try {
				throw new WrongFileException();
			
			} catch (WrongFileException e) {
				System.out.println("\n" + e.getMessage());
			}
		}
		
	}

}
