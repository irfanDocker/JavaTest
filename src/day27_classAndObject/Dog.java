package day27_classAndObject;

public class Dog {
	
	///instance variables
	
	String breed;
	String size;
	int age;
	String color;
	
	
	public Dog() {} // Default constructor
	
	
	//Parameterized constructor
	public Dog(String breed,String size,int age,String color) {
		
		this.breed = breed;  //setting value to instance variable breed.
		this.size = size;   //setting value to instance variable size.
		this.age = age;     //setting value to instance variable age.
		this.color = color; //setting value to instance variable color.
	}
	
	
	static int age1;
	
	//instance methods
	
	
	public void barking() {
		System.out.println(age);
		System.out.println(breed);
		System.out.println(size);
		System.out.println(color);
	}
	
	
	public static void barking2() {
		System.out.println(age1);
		Dog d = new Dog();
		System.out.println(d.age);
		System.out.println(d.breed);
		System.out.println(d.size);
		System.out.println(d.color);
	}
	
	
	public void eat() {
		System.out.println(breed + " is eating");
		
//		//Local variable
//		int num = 10;
//		System.out.println(num);
		
	}
	public void sleep() {
		System.out.println(breed + " is sleeping");
		//local Variable
		String name = "TechCircle";
	
	}
	public void sit() {
		System.out.println(breed + " is sitting");
		
//		for(int i = 0 ; i < 5; i++) {
//			System.out.println(i);
//		}
		
		//System.out.println(i);
		
		
	}
	public void run() {
		System.out.println(breed + " is running");
	}

}
