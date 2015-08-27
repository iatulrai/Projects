package javaCodeTesting;

public class Bicycle {

	int cadence = 0;
	int speed = 0;
	int gear = 1;

	void changeCadence(int newVlaue) {
		cadence = newVlaue;
	}

	void changeGear(int newValue) {
		gear = newValue;
	}

	void speedUp(int increment) {
		speed = speed + increment;
	}

	void applyBreaks(int decrement) {
		speed = speed - decrement;
	}

	void printStates() {
		System.out.println("Cadence: " + cadence + " Speed: " + speed + " Speed:"
				+ speed + " Gear: " + gear);

	}

}
