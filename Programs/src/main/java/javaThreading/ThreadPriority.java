package javaThreading;

public class ThreadPriority extends Thread {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();
		ThreadPriority tp4 = new ThreadPriority();

		tp1.setName("Thread A");
		tp2.setName("Thread B");
		tp3.setName("Thread C");
		tp4.setName("Thread D");

		tp1.setPriority(Thread.MIN_PRIORITY);
		tp2.setPriority(Thread.MAX_PRIORITY);
		tp3.setDaemon(true);
		tp4.setPriority(7);

		tp1.getState();
		tp2.getState();
		tp3.getState();
		tp4.getState();

		tp1.start();
		tp2.start();
		tp3.stop();
		tp4.start();

	    ThreadPriority.activeCount();

	}

	
	public void run() {

		System.out.println("Thread name: " + Thread.currentThread().getName() + " || Thread priority: "
				+ Thread.currentThread().getPriority() + " || Thread State: " + Thread.currentThread().getState());
		
       System.out.println(Thread.activeCount());

	}

}
