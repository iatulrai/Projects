package myTreeSet;

import java.util.TreeSet;

public class CountryMainClass {
	public static void main(String[] args) {
		
		Country c1 = new Country("India", "Modi", 91);
		Country c2 = new Country("Japan", "Huzi", 323);
		Country c3 = new Country("USA", "Obama", 1);
		Country c4 = new Country("Russia", "Putin", 922);
		
		TreeSet<Country> set = new TreeSet<>();
		
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);
		
		for (Country ctr : set){
			
			System.out.println(ctr.code);
		}
		
	}

}
