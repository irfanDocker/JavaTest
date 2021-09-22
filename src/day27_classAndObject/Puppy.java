package day27_classAndObject;

public class Puppy {
	
	
	int age;
	String name;
	
	public Puppy (){}
	
	public void printInfo() {
		System.out.println("Name of the puppy is "+name + ", "+age +" years old");
	}
	
	
	public Puppy(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	
	
	
}
