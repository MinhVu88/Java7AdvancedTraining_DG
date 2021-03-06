package com.lynda.javatraining.characterstreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (
				Scanner sc = new Scanner(new BufferedReader(new FileReader("tokenizedtext.txt")));
				
				//Scanner sc = new Scanner(new BufferedReader(new FileReader("textfile.txt")));
				
				//BufferedReader br = new BufferedReader(new FileReader("textfile.txt"));
				
				//BufferedWriter bw = new BufferedWriter(new FileWriter("newfile.txt"));
				
				) {
			
			/*
			int c;
			
			while ((c = br.read()) != -1) {
				bw.write(c);
			}
			
			System.out.println("All done!");
			*/
			
			sc.useDelimiter(",");
			
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		} /*catch (IOException e) {
			e.printStackTrace();
		} */
		
	}
}
