// no duplicate value
package myHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
		
		Set<String> ht = new HashSet<>();
		
		ht.add("Ram");
		ht.add("Shyam");
		ht.add("Mohan");
		ht.add("Sohan");
		ht.add("Raga");
		
		Iterator itr = ht.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}

}
