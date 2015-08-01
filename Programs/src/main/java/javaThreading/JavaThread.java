package javaThreading;

 class JavaThreadDemo implements Runnable{
	
	public void run() {
		
		go();
		
		
	}
	
	public void go() {
		
		System.out.println("Java thread");
		
	}
}
	class JavaThread {
	
	public static void main(String[] args) {
		
		Runnable run = new JavaThreadDemo();
		Thread td = new Thread();
		td.start();
		
	}

}
