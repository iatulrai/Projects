package myList;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<>();
		
		name.add("Ram");
		name.add("Shyam");
		name.add("Mohan");
		name.add("Sohan");
		
		System.out.println(name);
		
		for(String str : name) {
			
			System.out.println(str);
		}
	}

}
