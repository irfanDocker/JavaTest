package day29_inheritance_AccessModifier2;

import day29_inheritance_AccessModifier.A;

public class D extends A {
	public static void main(String[] args) {
		
		
		
		A a = new A();
		
		
		
		
		//protected
		System.out.println(a);
		
		
//		public 
		
		System.out.println(a.str4);
		a.publicMethod();
		
		
		
		
	}
}
