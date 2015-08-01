package javaThreading;

 class JavaThreadDemo implements Runnable{
	
	public void run() {
		
		System.out.println("Java thread");
		
	}
	
}
	class JavaThread {
	
	public static void main(String[] args) {
		
		Runnable run = new JavaThreadDemo();
		Thread td = new Thread(run);
		td.start();
		
	}

}
