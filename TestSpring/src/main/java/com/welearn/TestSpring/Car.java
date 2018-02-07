package com.welearn.TestSpring;

public class Car {
	private Wheel wheel;

	
	public Car(Wheel wheel1)
	{
		this.wheel = wheel1;
	}
	
	
	public Wheel getWheel() {
		System.out.println("inside get wheel");
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		System.out.println("inside set wheel");
		this.wheel = wheel;
	}
	
	public void move()
	{
		System.out.println("inside car move");
		wheel.rotate();
	}
}
