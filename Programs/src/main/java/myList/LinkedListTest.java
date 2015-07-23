package myList;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		
		LinkedList<String> str = new LinkedList<>();
		
		str.add("Atul");
		str.add("Vipul");
		str.add("Mukul");
		str.add("Sohan");
		
		System.out.println(str.size());
		System.out.println(str.isEmpty());
		System.out.println(str.indexOf("Mukul"));
		
		for(String s : str){
			System.out.println(s);
		}
	
	}

}
