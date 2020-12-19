package com.lynda.javatraining.characterstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try (
				FileReader fr = new FileReader("textfile.txt");
				
				FileWriter fw = new FileWriter("NewTextFile.txt");
				
				) {
			
			int c;
			
			while ((c = fr.read()) != -1) {
				fw.write(c);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
