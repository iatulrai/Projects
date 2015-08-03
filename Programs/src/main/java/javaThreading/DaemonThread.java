package javaThreading;

public class DaemonThread extends Thread {
	public static void main(String[] args) {

		DaemonThread dt1 = new DaemonThread();
		DaemonThread dt2 = new DaemonThread();
		DaemonThread dt3 = new DaemonThread();
		
		dt1.setName("I am Daemon-");

		dt1.setDaemon(true);

		dt1.start();
		dt2.start();
		dt3.start();
	}

	public void run() {

		for (int i = 1; i <= 5; i++) {

			if (Thread.currentThread().isDaemon()) {

				System.out.println(Thread.currentThread().getName() +" Daemon thread is running.");

			} else {

				System.out.println("User thread is running.");
			}

		}
	}

}
