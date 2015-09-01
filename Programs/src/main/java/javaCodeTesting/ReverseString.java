// program to reverse string in java
package javaCodeTesting;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		String original, reverse = "";
		Scanner in = new Scanner(System.in);

		System.out.println("enter the String to reverse: ");
		original = in.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {

			reverse = reverse + original.charAt(i);

		} // end for loop

		System.out.println("reverse of entered string is: " + reverse);
	}

}
