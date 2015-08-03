package javaThreading;

public class ThreadWaitTest {

	public static void main(String[] args) {

		ThreadWait tw = new ThreadWait();
		tw.start();
		System.out.println("Total is: " + tw.total);
	}

}

class ThreadWait extends Thread {
	int total;

	public void run() {
		for (int i = 0; i < 100; i++) {
			total += i;
		}

	}

}
