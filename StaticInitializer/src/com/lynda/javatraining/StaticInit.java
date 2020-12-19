package com.lynda.javatraining;

import java.util.ArrayList;

import com.lynda.olivepress.olives.Olive;
import com.lynda.olivepress.olives.OliveJar;

public class StaticInit {

	public static void main(String[] args) throws Exception {
		
		System.out.println("\nstarting application....");
		
		ArrayList<Olive> olives = OliveJar.olives;
		
		for (Olive o : olives) {
			System.out.println("\nit's a " + o.oliveName + " olive");
		}
		
	}
	
}
