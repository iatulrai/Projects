// Java thread pooling example

package javaThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {

	private String msg;

	public WorkerThread(String s) {

		this.msg = s;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName()
				+ "Start message = " + msg);
		processmsg();
		System.out.println(Thread.currentThread().getName() + "END");
	}

	private void processmsg() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

public class ThreadPool {
	public static void main(String[] args) {
		ExecutorService exe = Executors.newFixedThreadPool(5); // creating a
																// pool of 5
																// threads

		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread("" + i);
			exe.execute(worker); // calling execute method of ExecutorService
		}
		exe.shutdown();
		while (!exe.isTerminated()) {
			System.out.println("Finished all threads");
		}
	}

}
