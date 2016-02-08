package com.javadoc;

public class StringClassMethods {

	public static void main(String[] args) {

		String str = "My name is Atul Rai and I am from INDIA. ";

		String str1 = "I love my county";

		int len = str.length(); // length() method count the no. of length in
								// the string

		System.out.println("The length of above string is: " + len);

		System.out.println(str.concat(str1)); // add the two string together

	}

}
