package com.javadoc;

public class GetClassMethod {
	public static void main(String[] args) {

		GetClassMethod abc = new GetClassMethod();

		System.out.println("This will print the class name with package: "
				+ abc.getClass());

		System.out.println("This will print the only class name:  "
				+ abc.getClass().getSimpleName());

		System.out
				.println("This will print super class name of the current class: "
						+ abc.getClass().getSuperclass().getSimpleName());
	}
}
