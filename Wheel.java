package com.canddella.java.oop.basic;

public class Wheel {
	
	public Wheel() {
	super();
	}

	public String moveForward() {
		return "Moveing Forward ";
	}

	public String movebackward() {
		return "Moveing backward ";
	}

	@Override
	public String toString() {
		return "Wheel " + moveForward() + ",Wheel " + movebackward() ;
	}

}
