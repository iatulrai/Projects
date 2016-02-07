package com.javadoc;

public class SubClass extends SuperClass {

	public void printMethod() {
		super.printMethod();

		System.out.println("Printed in SubClass");
	}

	public static void main(String[] args) {
		SubClass s = new SubClass();
		s.printMethod();
	}

}
