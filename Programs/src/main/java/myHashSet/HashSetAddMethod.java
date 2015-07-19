package myHashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetAddMethod {

	public static void main(String[] args) {
		
		Set<String> str = new HashSet<>();
		
		str.add("Ram");
		str.add("Shyam");
		str.add("Mohan");
		str.add("Sohan");
		str.add("Shyam");
		str.add("Ram");		
					
		System.out.println(str);
			

		
		
	}

}
