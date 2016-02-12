// Exception handling with try and catch blocks

package com.javadoc;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers2 {

	private List<Integer> list;
	private static final int SIZE = 10;

	public ListOfNumbers2() {
		list = new ArrayList<Integer>(SIZE);

		for (int i = 0; i <= SIZE; i++) {

			list.add(new Integer(i));
		}
	}

	public void writeList() {

		PrintWriter out = null;

		try {

			System.out.println("Entered try statement");

			out = new PrintWriter(new FileWriter("OutFile.txt"));

			for (int i = 0; i < SIZE; i++) {
				out.println("Value at: " + i + " = " + list.get(i));
			}
		} catch (IndexOutOfBoundsException e) {
			System.err.println("IndexOutOfBoundsException: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Caught IOException: " + e.getMessage());
		}

	}

	public static void main(String[] args) {

		ListOfNumbers2 n = new ListOfNumbers2();
		n.writeList();
		// System.out.println(n);
	}
}
