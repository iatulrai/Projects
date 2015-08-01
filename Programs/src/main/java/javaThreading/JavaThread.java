// a thread implemented by Runnable interface

package javaThreading;

class JavaThreadDemo implements Runnable{
	
	public void run() {								// Always use public void run() method to call a thread
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("new thread");
		}
	}	
}
	
class JavaThread {
	
	public static void main(String[] args) {
		
		Runnable run = new JavaThreadDemo();
		Thread td = new Thread(run);
		td.start();
		System.out.println("main thread");
		
	}

}
