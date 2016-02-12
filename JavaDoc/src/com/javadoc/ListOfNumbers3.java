package com.javadoc;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers3 {

	private List<Integer> list;
	private static final int SIZE = 10;

	public ListOfNumbers3() {
		list = new ArrayList<Integer>(SIZE);

		for (int i = 0; i <= SIZE; i++) {

			list.add(new Integer(i));
		}
	}

	public void writeList() {
		PrintWriter out = null;

		try {
			System.out.println("Entering" + " try statement");

			out = new PrintWriter(new FileWriter("OutFile1.txt"));
			for (int i = 0; i < SIZE; i++) {
				out.println("Value at: " + i + " = " + list.get(i));
			}
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Caught IndexOutOfBoundsException: "
					+ e.getMessage());

		} catch (IOException e) {
			System.err.println("Caught IOException: " + e.getMessage());

		} finally {
			if (out != null) {
				System.out.println("Closing PrintWriter");
				out.close();
			} else {
				System.out.println("PrintWriter not open");
			}
		}
	}

	public static void main(String[] args) {

		ListOfNumbers3 n = new ListOfNumbers3();
		n.writeList();
		System.out.println();
		// System.out.println(n);
	}

}
