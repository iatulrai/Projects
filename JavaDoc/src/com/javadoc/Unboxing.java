package com.javadoc;

import java.util.ArrayList;
import java.util.List;

public class Unboxing {
	public static void main(String[] args) {

		Integer i = new Integer(-8);

		// 1. Unboxing through the method invocation

		int absVal = absoluteValue(i);
		System.out.println("absolute value of " + i + " = " + absVal);

		List<Double> ld = new ArrayList<Double>();
		ld.add(3.1416); // Π is autoboxed through method invocation.

		// 2. Unboxing through assignment
		double pi = ld.get(0);

		System.out.println("pi = " + pi);

	}

	private static int absoluteValue(Integer i) {
		// TODO Auto-generated method stub
		return (i < 0) ? -1 : i;
	}

}
