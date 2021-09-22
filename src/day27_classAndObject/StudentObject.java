package day27_classAndObject;

public class StudentObject {
	public static void main(String[] args) {
		
		
		Student obj1 = new Student();
		obj1.name = "John";
		obj1.age= 12;
		obj1.color = "Fair";
		obj1.gender = 'M';
		
		
		obj1.eat();
		obj1.sleep();
		obj1.run();
		
		
		Student student2 = new Student();
		student2.name = "Sophia";
		student2.age = 10;
		student2.color = "Fair";
		student2.age = 'F';
		
		student2.run();
		student2.sleep();
		student2.eat();
		
		
		
		
		Student student3 = new Student();
		
		student3.name = "Lily";
		student3.age = 11;
		student3.color = "Dark";
		student3.gender = 'F';
		
		student3.eat();
		student3.sleep();
		student3.run();

		
		
//	1- 	Create Default and parameterized constructor of the student class
//		
//	2-  Create list of batch 8 student	
		
		
	}
}
