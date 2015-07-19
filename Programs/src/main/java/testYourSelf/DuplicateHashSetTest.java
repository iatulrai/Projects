// contain the duplicates value
package testYourSelf;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateHashSetTest {
	public static void main(String[] args) {
		
		Set<String> newset = new HashSet<>();
		
		newset.add("Atul Rai");
		newset.add("Vipul Rai");
		newset.add("Mukul Rai");
		newset.add("Atul Rai");    // duplicate value
		newset.add("Rai");
		
		Iterator itr = newset.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}

}
