package com.javadoc;

class Bike {

	final void run() {
		System.out.println("Running...");
	}

}

public class HeroBike extends Bike {

	void run() {
		System.out.println("Running at speed of  100 kmph");

	}

	public static void main(String[] args) {

		HeroBike hero = new HeroBike();
		hero.run();

	}
}
