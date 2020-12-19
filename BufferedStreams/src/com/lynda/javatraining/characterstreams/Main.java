package com.lynda.javatraining.characterstreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try (
				BufferedReader br = new BufferedReader(new FileReader("hamlet.xml"));
				
				BufferedWriter bw = new BufferedWriter(new FileWriter("NewHamlet.txt"));
				
				) {
			
			int c;
			
			while ((c = br.read()) != -1) {
				bw.write(c);
			}
			
			System.out.println("\ndone");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
