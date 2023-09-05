package com.canddella.java.oop.basic;

public class Steering {
	
	public Steering() {
		super();
	}

	public String turnleft() {
		return "Is Turing Left";
	}

	public String turnRight() {
		return "Is Turing Right";

	}

	@Override
	public String toString() {
		return "Steering " + turnleft() + ", Steering" + turnRight() ;
	}
	
}
