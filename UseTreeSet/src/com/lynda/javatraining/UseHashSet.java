package com.lynda.javatraining;

import java.util.HashSet;

import com.lynda.javatraining.olives.Kalamata;
import com.lynda.javatraining.olives.Ligurio;
import com.lynda.javatraining.olives.Olive;
import com.lynda.javatraining.olives.Picholine;

public class UseHashSet {

	public static void main(String[] args) {
		
		Olive lig = new Ligurio();
		
		Olive kal = new Kalamata();
		
		Olive pic = new Picholine();
		
		HashSet<Olive> hSet = new HashSet<>();		
		
		hSet.add(pic);
		
		hSet.add(lig);
		
		hSet.add(kal);
		
		System.out.println("\nThere are " + hSet.size() + " olives in the set.");
				
		System.out.println("\n" + hSet);
	}

}
