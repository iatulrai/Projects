package javaThreading;

public class ThreadPriority extends Thread {

	public static void main(String[] args) {

		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		//ThreadPriority tp3 = new ThreadPriority();

		tp1.setName("Thread A");
		tp2.setName("Thread B");
		//tp3.setName("Thread C");

		tp1.setPriority(Thread.MIN_PRIORITY);
		tp2.setPriority(Thread.MAX_PRIORITY);
		//tp3.setDaemon(true);

		tp1.start();
		tp2.start();
		//tp3.start();

	}

	public void run() {

		System.out.println("Thread name: " + Thread.currentThread().getName() + " || Thread priority: " + Thread.currentThread().getPriority());
	
	}

}
