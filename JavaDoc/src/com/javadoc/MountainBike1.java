package com.javadoc;

public class MountainBike1 extends Bicycle {

	// fields of MountainBike class
	private String suspension;

	public MountainBike1(int startCadence, int startSpeed, int startGear,
			String suspensionType) {
		super(startCadence, startSpeed, startGear);
		// TODO Auto-generated constructor stub
		this.setSuspension(suspensionType);
	}

	public String getSuspension() {
		return this.suspension;
	}

	public void setSuspension(String suspensionType) {
		this.suspension = suspensionType;
	}

	public void printDescription() {
		super.printDescription();
		System.out.println("The " + "MountainBike has a " + getSuspension()
				+ " suspension.");
	}
}
