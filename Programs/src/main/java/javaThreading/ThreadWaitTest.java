package javaThreading;

public class ThreadWaitTest {

	public static void main(String[] args) {

		ThreadWait tw = new ThreadWait();
		tw.start();

		synchronized (tw) {
			try {

				System.out.println("waiting for complete:");
				tw.wait();

			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

		}
		System.out.println("Total is: " + tw.total);
	}

}

class ThreadWait extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			notify();

		}

	}

}
