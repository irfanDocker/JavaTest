package day27_classAndObject;

public class ObjPuppy {
	
	public static void main(String[] args) {
		
		Puppy p1 = new Puppy();
		p1.name = "Chow Chow";
		p1.age = 2;
		
		p1.printInfo();
		
		Puppy p2 = new Puppy("Maltese",3);
		p2.printInfo();
		
		
		Puppy p3 = new Puppy();
		p3.age = 3;
		p3.name = "Maltese";
		p3.printInfo();
		
		
		//Create default and parameterized constructor for the dog class.
		
		
		
		
		
	}
}
