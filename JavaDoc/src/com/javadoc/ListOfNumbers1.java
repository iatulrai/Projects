package com.javadoc;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers1 {

	private List<Integer> list;
	private static final int SIZE = 10;

	public ListOfNumbers1() {
		list = new ArrayList<Integer>(SIZE);

		for (int i = 0; i <= SIZE; i++) {

			list.add(new Integer(i));
		}
	}

	public void writeList() {
		
		PrintWriter out = null;
		
		try{
			
			System.out.println("Entered try statement");
			
			out = new PrintWriter(new FileWriter("OutFile.txt"));
			
			for (int i = 0; i < SIZE; i++){
				out.println("Value at: " + i + " = " + list.get(i));
			}
		}

	}
}
