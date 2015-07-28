package javaThreading;

public class OurClass {
	
	public void run() {
		for (int i = 0; i < 100; i++ ) {
			System.out.println(" Hello Java Thread");
		}
	}
	public static void main(String[] args) {
		OurClass oc = new OurClass();
		oc.run();
	}

}
