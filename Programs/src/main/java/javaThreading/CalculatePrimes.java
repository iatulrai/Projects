package javaThreading;

public class CalculatePrimes extends Thread {
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
				if (i % primes[j] == 0){
					prime = false;
					break;
				}

			}
			
			if (prime){
				primes[count++] = i;
				System.out.println("Found prime: " + i);
			}
		}
	}
	
	public static void main(String[] args) {
		CalculatePrimes calculator = new CalculatePrimes();
		calculator.start();
		try {
			Thread.sleep(TEN_SECOND);
		} catch (InterruptedException ex){
			ex.printStackTrace();
		}
		calculator.finished = true;
	}

}
