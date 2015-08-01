// a thread implemented by Runnable interface

package javaThreading;

class JavaThreadDemo implements Runnable{
	
	public void run() {		// Always use public void run() method to call a thread
		
		try {
			
			
			for (int i = 0; i < 10; i++) {
				
				Thread.sleep(2000);   // add sleep() method to get a chance to other thread to be run
				
				System.out.println("new thread");
			}
		} catch(InterruptedException ex){
			ex.printStackTrace();
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
