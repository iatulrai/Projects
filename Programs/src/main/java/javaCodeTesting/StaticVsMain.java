// Static Vs Main: which execute first?
package javaCodeTesting;

public class StaticVsMain {
	public static void main(String[] args) {

		System.out.println("I am a MAIN block :)");
	}

	static {
		System.out.println("I am a STATIC block :)");
		
	}

}
