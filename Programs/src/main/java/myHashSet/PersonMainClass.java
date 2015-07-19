package myHashSet;

import java.util.HashSet;

public class PersonMainClass {
	public static void main(String[] args) {
		
		
	    Person p1 = new Person("AAA", 12, "varanasi");
	    Person p2 = new Person("BBBB", 12, "ghazipura");
	    Person p3 = new Person("CCCCC", 14, "jaunpur");
	    Person p4 = new Person("DDDDDD", 144, "Delhi");   // duplicate
	    Person p5 = new Person("DDDDDD", 144, "Delhi");		
	    Person p6 = new Person("FFFFFFFF", 133, "Ald");
	    Person p7 = new Person("GGGGGGGGG", 123, "Delhi"); 		
	    Person p8 = new Person("HHHHHHHHHH", 17,  "varanasi");  // duplicate
	    Person p9 = new Person("HHHHHHHHHH", 17,  "varanasi");
	    
	    HashSet<Person> set = new HashSet<>();
	    
	    set.add(p1);
	    set.add(p2);
	    set.add(p3);
	    set.add(p4);
	    set.add(p5);
	    set.add(p6);
	    set.add(p7);
	    set.add(p8);
	    set.add(p9);
	    
	   
	    
	    for (Person per : set) {
	    	System.out.println(per.name +" "+ per.age +" "+ per.city);
	    	
	    }
	}
}
