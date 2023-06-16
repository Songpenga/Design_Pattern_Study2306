package design_Pattern.Adapter;

import java.util.ArrayList;

public class User {
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Dog("댕이"));
		animals.add(new Cat("나비"));
		animals.add(new Dog("츄츄"));
		//animals.add(new Tiger("어흥"));
		animals.add(new TigerAdapter("어흥"));
		
		animals.forEach(animal -> {
			animal.sound();
		});
	}
}
