package javaThreading;

class SyncTest implements Runnable {

	private int balance;

	@Override
	public synchronized void run() { // add synchronized method
		for (int i = 0; i < 35; i++) {
			increment();
			System.out.println("Balance is " + balance);
		}

	}

	public void increment() {

		int i = balance;
		balance++;
	}

}

public class ThreadSyncTest {

	public static void main(String[] args) {

		SyncTest tst = new SyncTest();

		Thread a = new Thread(tst);
		Thread b = new Thread(tst);

		a.start();
		b.start();
	}

}
