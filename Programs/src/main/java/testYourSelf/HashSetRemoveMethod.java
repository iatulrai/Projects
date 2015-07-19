package testYourSelf;

import java.util.HashSet;
import java.util.Set;

public class HashSetRemoveMethod {
	
	public static void main(String[] args) {
		
		Set<String> str = new HashSet<>();
		
		str.add("Ram");
		str.add("Shyam");
		str.add("Mohan");
		str.add("Sohan");
		str.add("Shyam");
		str.add("Ram");	
		str.add("Atul");
					
		System.out.println("Values before remove: "+str);
		
		boolean rmv = str.remove("Atul");
		
		System.out.println("Values after remove: "+str);
		
		
			

		
		
	}

}