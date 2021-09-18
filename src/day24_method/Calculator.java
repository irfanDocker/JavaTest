package day24_method;

public class Calculator {
	
	
	public static void main(String[] args) {
//		addition(3,6);
//		
//		addition(13,16);
//		
//		addition(0,16);
		
		int num1 = 30;
		int num2 = 3;
		
		
		addition(num1,num2);
		subtraction(num1,num2);
		multiplication(num1,num2);
		division(num1,num2);
		
	}
	
	public static void addition(int num1, int num2) {
		
		System.out.println(num1+num2);
		
	}
	
	//create method for rest of the 3 operators. - , * , / 
	
	
	public static void subtraction(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	
	public static void multiplication(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public static void division(int num1, int num2) {
		System.out.println(num1 / num2);
	}
	
	
	
	
}
