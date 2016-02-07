package com.javadoc;

public class MountainBike extends Bicycle {

	// fields of MountainBike class
	public int seatHieght;

	// constructor of MountainBike
	public MountainBike(int startHieght, int startCadence, int startSpeed,
			int startGear) {
		super(startCadence, startSpeed, startGear);
		seatHieght = startHieght;
	}

	// the MountainBike subclass adds one method
	public void setHeight(int newValue) {
		seatHieght = newValue;
	}
}
