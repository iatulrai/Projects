package testYourSelf;

public class Person {
	String name;
	int age;
	String city;
	
	
	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getCity() {
		return city;
	}
	
	
	
	public int hashCode() {
		
		return (name.length() * (int) age);
		
	}
	
	public boolean equals(Object ob) {
		
		if (ob instanceof Person ) {
			
			
			Person p = (Person) ob;
			
			
			return (p.name.equals(this.name) && p.age == this.age);
			
		}else{
			  
			return false;
		}
	}
}


