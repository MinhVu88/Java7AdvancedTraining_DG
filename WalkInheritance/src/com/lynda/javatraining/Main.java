package com.lynda.javatraining;

import com.lynda.javatraining.olives.Ligurio;

public class Main {

	public static void main(String[] args) {
		
		Object obj = new Ligurio();
		
		Class<?> someClass = obj.getClass();
		
		System.out.println("\nsub class: " + someClass.getSimpleName());
		
		Class<?> superClass = someClass.getSuperclass();
		
		System.out.println("\nsuper class: " + superClass.getSimpleName());
		
		Class<?> topClass = superClass.getSuperclass();
		
		System.out.println("\ntop class of all: " + topClass.getSimpleName());
		
		Package p = someClass.getPackage();
		
		System.out.println("\npackage: " + p.getName());
		
	}

}
