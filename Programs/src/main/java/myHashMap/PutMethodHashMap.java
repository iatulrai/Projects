package myHashMap;

import java.util.HashMap;

public class PutMethodHashMap {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("Hello", 12);
		hm.put("Hi", 31);
		
		System.out.println(hm);
		
	}

}
