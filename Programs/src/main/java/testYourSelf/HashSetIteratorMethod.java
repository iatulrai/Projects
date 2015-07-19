package testYourSelf;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteratorMethod {
	
	public static void main(String[] args) {
		
		Set<String> str = new HashSet<>();
		
		str.add("Ram");
		str.add("Shyam");
		str.add("Mohan");
		str.add("Sohan");
		str.add("Shyam");
		str.add("Ram");	
					
		Iterator itr = str.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}
			

		
		
	}

}