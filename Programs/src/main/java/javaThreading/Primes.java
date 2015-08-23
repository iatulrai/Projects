package javaThreading;

import java.util.Timer;
import java.util.TimerTask;

public class Primes extends Thread {
	public static final int MAX_PRIME = 1000000;
	public static final int TEN_SECOND = 10000;

	public volatile boolean finished = false;

	public void run() {
		int[] primes = new int[MAX_PRIME];
		int count = 0;

		for (int i = 2; count < MAX_PRIME; i++) {

			if (finished) {
				break;
			}

			boolean prime = true;
			for (int j = 0; j < count; j++) {
				if (i % primes[j] == 0) {
					prime = false;
					break;
				}

			}

			if (prime) {
				primes[count++] = i;
				System.out.println("Found prime: " + i);
			}
		}
	}

	public static void main(String[] args) {

		Timer timer = new Timer();

		final Primes calculator = new Primes();
		calculator.start();

		timer.schedule(
				new TimerTask(){
					public void run() {
						calculator.finished = true;
					}
				}, TEN_SECOND);
	}
}
