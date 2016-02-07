package com.javadoc;

public class TestBikes {

	public static void main(String[] args) {

		Bicycle bike1, bike2, bike3;

		bike1 = new Bicycle(20, 10, 1);

		bike2 = new MountainBike1(20, 10, 5, "Dual");

		bike3 = new RoadBike(40, 20, 8, 23);

		bike1.printDescription();
		bike2.printDescription();
		bike3.printDescription();

	}

}
