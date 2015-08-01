//a thread extended by Thread class

package javaThreading;

public class ThreadExtends extends Thread {
	
	public void run() {
		System.out.println("Java Thread-Concretepage.com");
	}
	public static void main(String[] args) {
		
		ThreadExtends te = new ThreadExtends();
		te.start();
	}

}
