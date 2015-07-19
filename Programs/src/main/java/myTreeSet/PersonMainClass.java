package myTreeSet;

import java.util.TreeSet;

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
	    
	    TreeSet<Person> tset = new TreeSet<>();
	    
	    tset.add(p1);
	    tset.add(p2);
	    tset.add(p3);
	    tset.add(p4);
	    tset.add(p5);
	    tset.add(p6);
	    tset.add(p7);
	    tset.add(p8);
	    tset.add(p9);
	    
	   
	    
	    for (Person per : tset) {
	    	System.out.println(per.name +" "+ per.age +" "+ per.city);
	    	
	    }
	}
}
