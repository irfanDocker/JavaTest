package day29_inheritance_AccessModifier;

public class A {
	
	private String str = "private";
	
	String str2 = "default";
	
	protected String str3= "protected";
	
	public String str4 = "public";
	
	
	private void privateMethod() {
		System.out.println("Private method");
	}
	
	void defaultMethod() {
		System.out.println("Default method");
	}
	
	protected void protectedMethod() {
		System.out.println("Protected method");
	}
	
	
	public void publicMethod() {
		System.out.println("public method");
	}
}
