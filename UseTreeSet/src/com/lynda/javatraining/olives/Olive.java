package com.lynda.javatraining.olives;

public class Olive implements Comparable<Olive> {

	public OliveName eName;
	
	public OliveColor eColor;
	
	public Olive() {}
	
	public Olive(OliveName eName, OliveColor eColor) {
		this.eName = eName;
		
		this.eColor = eColor;
	}
	
	@Override
	public String toString() {
		return "\n\nolive name: " + this.eName.toString() + ", color: " + this.eColor.toString();
	}

	@Override
	public int compareTo(Olive o) {
		
		/*
		// solution 1
		String s1 = this.getClass().getSimpleName();
		
		String s2 = o.getClass().getSimpleName();
		*/
		
		// solution 2
		String s1 = this.eName.toString();
		
		String s2 = o.eName.toString();
		
		return s1.compareTo(s2);
	}

}
