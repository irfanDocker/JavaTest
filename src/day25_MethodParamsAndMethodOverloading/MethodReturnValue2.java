package day25_MethodParamsAndMethodOverloading;

public class MethodReturnValue2 {
	public static void main(String[] args) {
		
		
		add2Num(1,3);
		
		System.out.println(add3Num(1,2,3));
		
		int result = add3Num(1,2,3) * 10;
		
		System.out.println(result);
		
		
		
		
		
		if (passwordValidation("assword@1")) {
			System.out.println("Here is your new account.");
			
		}
		
		
	}
	
	public static void add2Num(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	
	public static int add3Num(int num1, int num2,int num3) {
		//System.out.println(num1+num2);
		return num1 + num2 + num3;
	}
	
	
	public static boolean passwordValidation(String password) {
		Boolean hasDigit = false;
		Boolean hasUpperCase = false;
		Boolean hasLowerCase = false;
		Boolean symbol = false;
		
		boolean isValidPassword = false;
		
		if (password.length() > 7) {

			for (int i = 0; i < password.length(); i++) {// i=
				char ch = password.charAt(i);
				if (Character.isDigit(ch)) {
					hasDigit = true;	
				}
				if (Character.isUpperCase(ch)) {
					hasUpperCase = true;
				}
				if (Character.isLowerCase(ch)) {
					hasLowerCase = true;
				}
				if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
					symbol = true;
				}
				
			}
			if (hasDigit && hasUpperCase && hasLowerCase && symbol) {
				System.out.println("Welcome!");
				isValidPassword = true;
			} else {
				System.out.println("Password invalid");
			}
		} else {
			System.out.println("Password must be at least 8 characters long");
		}
		
		return isValidPassword;
		
	}
	
	
	
	
	
}
