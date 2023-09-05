package com.canddella.java.oop.basic;

public class Engine {
	
	public Engine() {
		super();
	}

	public String start() {
		return "Engine is Starting";
	}

	public String stop() {
		return "Engine is Stoping";
	}

	@Override
	public String toString() {
		return "Engine " + start() + "Engine " + stop();
	}
	
}
