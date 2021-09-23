package day27_classAndObject;

import java.util.ArrayList;

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
		
		ArrayList<Student> batch8 = new ArrayList<>();
		
		batch8.add(new Student("Opal",18,'F',"White"));
		
		Student darima = new Student("Darima",18,'F',"White");
		
		batch8.add(darima);	
		
		Student batch8Student2 = new Student ("Dina",18,'F',"White");
		Student batch8Student3 = new Student ("Famira",18,'F',"White");
		Student batch8Student4 = new Student ("Elira",18,'F',"White");
		Student batch8Student5 = new Student ("Pedro",18,'M',"White");
		Student batch8Student6 = new Student ("Mergen",18,'M',"White");
		Student batch8Student7 = new Student ("Qasir",18,'M',"White");
		Student batch8Student8 = new Student ("Erkin",18,'M',"White");
		Student batch8Student9 = new Student ("Zamira",18,'F',"White");
		
		
		batch8.add(batch8Student2);
		batch8.add(batch8Student3);
		batch8.add(batch8Student4);
		batch8.add(batch8Student5);
		batch8.add(batch8Student6);
		batch8.add(batch8Student7);
		batch8.add(batch8Student8);
		batch8.add(batch8Student9);
		
		
		for (int i = 0 ; i <  batch8.size(); i++) {
			batch8.get(i).sleep();
			
		}
		
	}
}
