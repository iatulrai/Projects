package com.javadoc;

public class CompareString {
	public static void main(String[] args) {

		String str = "I am an ADMIN";
		String str1 = "I Love INDIA";
		String str2 = "I am an ADMIN";

		// boolean endsWith(String suffix)
		// Returns true if this string ends with or begins with the substring
		// specified as an argument to the method.
		boolean b1 = str.endsWith("admin");
		boolean b2 = str.endsWith("ADMIN");

		System.out.println(b1);
		System.out.println(b2);

		// boolean startsWith(String prefix)

		boolean b3 = str.startsWith("I am");
		boolean b4 = str.startsWith("I an");

		System.out.println(b3);
		System.out.println(b4);

		// int compareTo(String anotherString)
		// Compares two strings lexicographically. Returns an integer indicating
		// whether this string is greater than (result is > 0), equal to (result
		// is = 0), or less than (result is < 0) the argument.

		int i = str.compareTo(str1);
		System.out.println(i);

		// boolean equals(Object anObject)
		// Returns true if and only if the argument is a String object that
		// represents the same sequence of characters as this object.

		boolean b5 = str.equals(str1);
		System.out.println(b5);
		boolean b6 = str.equals(str2);
		System.out.println(b6);

	}

}
