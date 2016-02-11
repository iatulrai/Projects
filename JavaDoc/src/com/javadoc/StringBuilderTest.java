package com.javadoc;

public class StringBuilderTest {
	
	public static void main(String[] args) {

		// creates empty builder, capacity 16
		StringBuilder sb = new StringBuilder();

		// adds 7 character string at beginning
		sb.append("AtulRai");
		System.out.println(sb);
		System.out.println(sb.length());

		System.out.println(sb.reverse());

	}

}
