package javaThreading;

public class SyncExample {
	
	private static Object lockObject = new Object();
	
	private static class Thread1 extends Thread{
		
		public void run() {
			
			synchronized (lockObject) {
				int y;
				int x = y = 0;
				System.out.println(x);
			}
		}
	}
	
	private static class Thread2 extends Thread{
		
		public void run() {
			
			synchronized (lockObject) {
				int y;
				int x = y = 1;
				System.out.println(y);
			}
		}
	}
	public static void main(String[] args) {
		
		new Thread1().start();
		new Thread2().start();
	}

}
