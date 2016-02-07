// Inheritance  example

package com.javadoc;

public class Bicycle {

	// fields of Bicycle class
	public int cadence;
	public int speed;
	public int gear;

	// constructor of Bicycle class
	public Bicycle(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}

	// methods of Bicycle class
	public void setCadence(int newValue) {

		cadence = newValue;

	}

	public void setGear(int newValue) {

		gear = newValue;

	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}

	// a printDescription method could be added to the class that displays all
	// the data
	public void printDescription() {
		System.out.println("\nBike is " + "in gear " + this.gear
				+ " with a cadence of " + this.cadence
				+ " and travelling at a speed of " + this.speed + ". ");
	}

}