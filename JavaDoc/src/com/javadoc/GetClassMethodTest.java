package com.javadoc;

public class GetClassMethodTest {

	public void printClassName(Object obj) {
		System.out.println("The object's" + " class is "
				+ obj.getClass().getSimpleName());
	}

	public static void main(String[] args) {

		GetClassMethodTest myclass = new GetClassMethodTest();
		myclass.printClassName(myclass);

	}
}
