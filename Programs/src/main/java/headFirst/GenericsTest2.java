// passing ArrayList in Generics

package headFirst;

import java.util.ArrayList;

public class GenericsTest2 {
	public static void main(String[] args) {
		
		new GenericsTest1().go();
	}
	
	public void go() {
		
		ArrayList<Animal> animals = new ArrayList<>();
		
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Dog());
		
		takeAnimals(animals);
		
	}
	
	public void takeAnimals(ArrayList<Animal> animals) {
		
		for (Animal a : animals) {
			
			a.eat();

		}
	}

}


/* abstract class Animal {
	void eat() {
		System.out.println("animal eating");
	}
}

class Dog extends Animal {
	void bark(){
		
		
	}
}

class Cat extends Animal {
	void meow() {
		
	}
}

*/