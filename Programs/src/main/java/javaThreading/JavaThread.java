package javaThreading;

 class JavaThreadDemo implements Runnable{
	
	public void run() {
		
		System.out.println("new thread");
		
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
