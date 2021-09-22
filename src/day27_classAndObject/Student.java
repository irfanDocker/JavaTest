package day27_classAndObject;

public class Student {
	
	//Instance Variables
	String name; 
	int age;
	char gender;
	String color;
	
	
	public Student() {}
	
	public Student(String name,int age, char gender, String color) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.color = color;
	}
	
	
	
	public void eat() {
		System.out.println(name +" is eatting");
	}
	
	public void run() {
		System.out.println(name +" is running!");
	}
	
	public void sleep() {
		System.out.println(name +" is sleeping");
	}
	
	
	
	
	
	
}
