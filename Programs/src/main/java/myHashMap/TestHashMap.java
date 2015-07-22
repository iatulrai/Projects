package myHashMap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		
		Map<Integer, Bean> mymap = new HashMap<Integer, Bean>();
		
		Bean b1 = new Bean("Ram");
		Bean b2 = new Bean("Shyam");
		Bean b3 = new Bean("Mohan");
		
		mymap.put(1, b1);
		mymap.put(2, b2);
		mymap.put(3, b3);
		
		System.out.println(mymap.size());
		
		//System.out.println(mymap.get(1).name);
		
		for (Bean b : mymap.values()) {   					// display the value of map
			
			System.out.println(b.name);
			
		}
		
		
		for (Integer i : mymap.keySet() ){				// display the key of map
					
			System.out.println(i.intValue());
					
		}
	}

}

class Bean {
	
	public String name;
	
	public Bean(String name){
		this.name = name;
	}
	
}
