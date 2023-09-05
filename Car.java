package com.canddella.java.oop.basic;

public class Car {

	protected Integer numberOfDoors = 4 ;

	protected static Wheel wheel = new Wheel();
	protected static Steering steering = new Steering();
	protected static Engine engine = new Engine();

	public Car(Integer numberOfDoors) {
		super();
		this.numberOfDoors = numberOfDoors;
	}

	public Integer getNumberOfDoors() {
		return numberOfDoors;
	}

	public static Wheel getWheel() {
		return wheel;
	}

	public static Steering getSteering() {
		return steering;
	}

	public static Engine getEngine() {
		return engine;
	}

	
}