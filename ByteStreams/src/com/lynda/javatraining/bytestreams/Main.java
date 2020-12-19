package com.lynda.javatraining.bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try ( 
				/*
				FileInputStream fis = new FileInputStream("textfile.txt");
				
				FileOutputStream fos = new FileOutputStream("NewTextFile.txt");
				*/
				
				FileInputStream fis = new FileInputStream("flower.jpg");
				
				FileOutputStream fos = new FileOutputStream("NewFlower.jpg");
				
				) {
			
			int b;
			
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("\n" + e.getMessage());
		
		}catch (IOException e) {
			System.out.println("\n" + e.getMessage());
		}
		
	}
}
