package com.javadoc;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingDemo {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		for (int i = 1; i < 50; i += 2) {
			li.add(i);
		}
		
		System.out.println(li);

	}

}
