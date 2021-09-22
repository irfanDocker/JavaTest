package day27_classAndObject;

import java.util.ArrayList;

public class DogObject {
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
		dog1.age= 5;
		dog1.breed = "Neapolitan Mastiff";
		dog1.color = "Black";
		dog1.size = "Large";
		
		dog1.eat();
		dog1.sleep();
		dog1.sit();
		dog1.run();
		
		
		Dog dog4 = new Dog("Neapolitan Mastiff","Large",5,"Black");
		
		dog4.eat();
		dog4.sleep();
		dog4.sit();
		dog4.run();
		
		
		
		
		Dog dog2 = new Dog();
		dog2.breed = "Maltese";
		dog2.size = "Small";
		dog2.age = 2;
		dog2.color = "White";
		dog2.eat();
		dog2.sleep();
		dog2.sit();
		dog2.run();
		
		
		Dog dog3 = new Dog();
		dog3.breed = "Chow Chow";
		dog3.size = "Medium";
		dog3.age = 3;
		dog3.color = "Brown";
		dog3.eat();
		dog3.sleep();
		dog3.sit();
		dog3.run();
		
		
		//Create ArrayList of dog, and add 10 elements
		
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		dogs.add(dog4);
		
		Dog myDog5 = new Dog("Greyhound", "Large", 6, "Black");
		Dog myDog6 = new Dog("Minidoodle", "Small", 5, "Brown");
		Dog myDog7 = new Dog("Poodle", "Large", 1, "Black");
		Dog myDog8 = new Dog("Aussie Doodle", "Medium", 3, "Gray");
		Dog myDog9 = new Dog("German Sheppard", "Large", 5, "Brown");
		Dog myDog10 = new Dog("Jack Russel", "Medium", 3, "White");
		
		//Create ArrayList of dog, and add 10 elements

		dogs.add(myDog5);
		dogs.add(myDog6);
		dogs.add(myDog7);
		dogs.add(myDog8);
		dogs.add(myDog9);
		dogs.add(myDog10); 
		
		
		for (Dog dog : dogs ) {
			System.out.println(dog.breed);
			
			dog.eat();
		}
		
		
		
		
		
		
		
	}
}
