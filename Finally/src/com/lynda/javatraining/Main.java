package com.lynda.javatraining;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = null;
		
		BufferedReader br = null;
		
		try {
			fr = new FileReader("ATextFile.tx");
			
			br = new BufferedReader(fr); 
			
			String s;
			
			while((s = br.readLine()) != null) { 
				System.out.println("\n" + s); 
			} 
			
			/*
			fr.close();
			
			br.close();
			*/
			
		} catch (FileNotFoundException e) {
			System.out.println("\n" + e.getMessage());
		
		}finally {
			System.out.println("\nexecuting finally block");
			
			if(fr != null) {
				fr.close();
			}
			
			if(br != null) {
				br.close();
			}
			
		}
		
		System.out.println("\nstill alive");
		
		/*
		FileReader fr = new FileReader("ATextFile.tx");
		
		BufferedReader br = new BufferedReader(fr); 
		
		String s;
		
		while((s = br.readLine()) != null) { 
			System.out.println("\n" + s); 
		} 
		
		fr.close();
		
		br.close();
		*/
	}

}
