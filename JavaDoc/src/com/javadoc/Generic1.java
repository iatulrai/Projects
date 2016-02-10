// example of Generic with casting

package com.javadoc;

import java.util.ArrayList;
import java.util.List;

public class Generic1 {
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("hello");
		String s = (String) list.get(0); // casting applied
		System.out.println(s);

	}

}
