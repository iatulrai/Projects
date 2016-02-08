//Converting Strings to Numbers
package com.javadoc;

public class ValueOfDemo {
	public static void main(String[] args) {

		if (args.length == 2) {
			
			

			// convert string to number

			float a = (Float.valueOf(args[0])).floatValue();
			float b = (Float.valueOf(args[1])).floatValue();

			// do some arithmetic

			System.out.println("a + b= " + (a + b));
			System.out.println("a - b = " + (a - b));
			System.out.println("a * b = " + (a * b));
			System.out.println("a / b = " + (a / b));
			System.out.println("a % b = " + (a % b));
		} else {
			System.out.println("This program "
					+ " requires two command-line arguments.");

		}
	}

}
