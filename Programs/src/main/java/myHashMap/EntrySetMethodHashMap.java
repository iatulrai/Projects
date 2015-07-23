package myHashMap;

import java.util.HashMap;
import java.util.Map;

public class EntrySetMethodHashMap {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("Hello", 12);
		hm.put("Hi", 31);
		hm.put("How", 132);
		hm.put("When", 313);
		hm.put("Where", 102);
		hm.put("Hi", 31);
		
		System.out.println(hm);
		
		
		// way 1(easy way) to iterate the Map 
		
		System.out.println("(easy way) to iterate the Map");
		
		for(Map.Entry<String, Integer> entry : hm.entrySet()) {
			
			System.out.println("Key : " + entry.getKey() + " | Value: " + entry.getValue());
		}
		
		
		// way 2 to(weired way) to iterate the Map
		System.out.println("(weired way) to iterate the Map");
		
		for (Object key : hm.keySet()) {
			
			System.out.println("Key: " + key.toString() + " Value : " + hm.get(key));
		}
	}

}