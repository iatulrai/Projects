package javaThreading;

public class ThreadVolatile {

	private static volatile boolean val = true;

	public static void main(String[] args) {
		
		new ThreadVolatile().new First().start();
		new ThreadVolatile().new Second().start();

	}

	class First extends Thread {
		
		public void run() {

			while (true) {

				if (val) {

					System.out.println("First thread is working");
					val = false;
				}

			}
		}
	}

	class Second extends Thread {
		
		public void run() {
			
			while (true) {
				
				if (!val) {
					
					System.out.println("Second thread is working");
					try {

						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					val = true;
				}
			}
		}
	}

}
