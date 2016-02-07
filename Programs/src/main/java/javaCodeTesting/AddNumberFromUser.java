package javaCodeTesting;

import java.util.Scanner;

public class AddNumberFromUser {
	public static void main(String[] args) {

		int a, b, c;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the first value: ");
		a = in.nextInt();
		System.out.println("Enter the second value: ");
		b = in.nextInt();

		c = a + b;

		System.out.print(c);

	}
}
