package com.lynda.javatraining.olives;


public class Olive {

	public OliveName eName;
	
	public long color;
	
	public Olive(OliveName oliveName, long color) {
		this.eName = oliveName;
		
		this.color = color;
	}
	
	@Override
	public String toString() {
		return this.eName.toString();
	}

}
