package javaThreading;

import java.util.ArrayList;
import java.util.List;

public class ThreadWaitNotify {

	private static Object lock = new Object();
	private static List<String> list = new ArrayList<>();

	public static void main(String[] args) {

		new Producer().start();
		new Consumer().start();

	}

	static class Producer extends Thread {

		public void run() {

			while (true) {

				synchronized (lock) {

					if (list.size() == 0) {

						System.out.println("Producer added A");
						list.add("A");

						try {

							lock.wait();

						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					lock.notify();

				}
			}
		}
	}

	static class Consumer extends Thread {

		public void run() {

			while (true) {

				synchronized (lock) {

					if (list.size() == 1) {

						System.out.println("Consumer comsumes A");
						list.remove(0);
						lock.notify();

						try {

							lock.wait();

						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					}

					try {

						Thread.sleep(2000);

					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
		}
	}
}
