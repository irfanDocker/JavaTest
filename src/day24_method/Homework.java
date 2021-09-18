package day24_method;

public class Homework {
	
//	Password validation
//
//    1. 8 character at least
//    2. there must be a digit            (isUpper   isLowercase)
//    3. there must be a letter (at least one upper case & one lower case)
//    4. there must be special character
	
	
	public static void main(String[] args) {
		
		
		String password = "P@a111111111";
		
		
		passwordValidation(password);
		
		
		passwordValidation("pass123@");
		
		passwordValidation("");
		
		passwordValidation("PASS@1");
		
		passwordValidation("PASS@1WORD");

	}
	
	
	public static void passwordValidation(String password) {
		Boolean hasDigit = false;
		Boolean hasUpperCase = false;
		Boolean hasLowerCase = false;
		Boolean symbol = false;

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
			} else {
				System.out.println("Password invalid");
			}
		} else {
			System.out.println("Password must be at least 8 characters long");
		}
		
		
	}
	
	
	
	
	
	
	
}
