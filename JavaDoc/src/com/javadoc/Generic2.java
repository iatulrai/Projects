// example of Generic with casting

package com.javadoc;

import java.util.ArrayList;
import java.util.List;

public class Generic2 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("hello");
		String s = list.get(0); // no cast

		System.out.println(s);
	}

}
