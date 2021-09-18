package day25_MethodParamsAndMethodOverloading;

public class MethodParameters {
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	public static void sayHello(String name) {
		System.out.println("Hello, "+name);
	}
	
	public static void main(String[] args) {
		sayHello("Hannah");
		
		sayHello("Nadia");
		
		sayHello("Opal");
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
}
