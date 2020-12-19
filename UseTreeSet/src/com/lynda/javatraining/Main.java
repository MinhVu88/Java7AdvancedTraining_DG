package com.lynda.javatraining;

import java.util.TreeSet;

import com.lynda.javatraining.olives.Kalamata;
import com.lynda.javatraining.olives.Ligurio;
import com.lynda.javatraining.olives.Olive;
import com.lynda.javatraining.olives.Picholine;

public class Main {

	public static void main(String[] args) {
		
		Olive lig = new Ligurio();
		
		Olive kal = new Kalamata();
		
		Olive pic = new Picholine();
		
		TreeSet<Olive> tSet = new TreeSet<>();
		
		try {
			tSet.add(pic);
			
			tSet.add(kal);
			
			tSet.add(lig);
		
		} catch (Exception e) {
			System.out.println("\n" + e.getMessage());
		}
		
		System.out.println(tSet);

	}

}
