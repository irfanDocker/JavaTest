package day29_inheritance_AccessModifier;

public class C {

	
		public static void main(String[] args) {
			A a = new A();
			System.out.println(a.str2);
			a.defaultMethod();
			
			
			//protected
			System.out.println(a.str3);
			a.protectedMethod();
			
			
//			public 
			
			System.out.println(a.str4);
			a.publicMethod();	
			
			
		}
}
