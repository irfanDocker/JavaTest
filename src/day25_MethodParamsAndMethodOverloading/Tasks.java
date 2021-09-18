package day25_MethodParamsAndMethodOverloading;


public class Tasks {
	/*
	1. create a function that can check if the given integer is positive, negative or zero
	
	2. create a function that can calculate the grade of the student
	
	3. create a function that can print out the combination of two integer arrays
	
	4. create a function that can print a string without the duplicated characters
	        "aaabbbccc"
	        abc
	        
	5.  write a method that can print out the full name of a person in regular format
	            ex:
	               fullName("teChCirCle", "SCHOOL");
	               	output:
	               		"Techcircle School"
	               		
	 */
	
	
	
	public static void main(String[] args) {
		
//		System.out.println(chechIntegers(10) );
//		
//		
//		System.out.println(chechIntegers(-10) );
//		
//		System.out.println(chechIntegers(0) );
//		
//		
//		
//		String actualResult = nonDuplicateDCharacter("aaabbbccc");
//		String expectedResult = "abc";
//		
//		if (actualResult.equals(expectedResult)) {
//			System.out.println("Test passed.");
//		}else {
//			System.out.println("Test failed");
//		}
//		
//		
//		
//		System.out.println( nonDuplicateDCharacter("aaabbbcccdddddddddeeeeeeeeeefffffffffff"));
		
		
		
//		String firstName = "teChCirCle";
//		String lastName = "SCHOOL";
//		
//		// "Techcircle School"
//		
//		
//		firstName = firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);
//		lastName = lastName.toUpperCase().substring(0,1) + lastName.toLowerCase().substring(1);
//		
//		System.out.println(firstName);
//		System.out.println(lastName);
//		
//		String fullName = firstName + " "+ lastName;
//		System.out.println(fullName);
//		
		
		
		
		System.out.println(formatFullName("tECHCIRCLE","SCHOOL"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
//	public static String chechIntegers(int num) {
//		
//		String msg = "";
//		
//		if (num > 0) {
//			msg = "Positive";
//		}else if (num < 0) {
//			msg = "Negative";
//		}else if (num == 0) {
//			msg = "Zero";
//		}
//		
//		return msg;
//	}
	
	
	
public static String chechIntegers(int num) {
		
		//String msg = "";
		
		if (num > 0) {
			return  "Positive";
		}else if (num < 0) {
			return "Negative";
		}else if (num == 0) {
			return "Zero";
		}else {
			return "";
		}
		
	
		
	
	}


//4. create a function that can print a string without the duplicated characters
//"aaabbbccc"
//abc




	public static String nonDuplicateDCharacter(String str) {

		//String str = "aaaaaaabbbbbbbbbbbccccccccccccddddddeeeeffffgggg";
		//String expectedStr = "abc";
		
		String uniqueChars = "";
		
		
		for (int i = 0 ; i < str.length(); i++) {
			
			
			String currentChar = Character.toString(str.charAt(i));
			
			
			if (!uniqueChars.contains(currentChar)) {
				
				uniqueChars += currentChar;
				
			}
			
			
		}
		

//		System.out.println(uniqueChars);
		return uniqueChars;
	}



//	5.  write a method that can print out the full name of a person in regular format
//    ex:
//       fullName("teChCirCle", "SCHOOL");
//       	output:
//       		"Techcircle School"



	public static String formatFullName(String firstName, String lastName) {
		

		firstName = firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);
		lastName = lastName.toUpperCase().substring(0,1) + lastName.toLowerCase().substring(1);
		
		String fullName = firstName + " "+ lastName;
//		System.out.println(fullName);
		
		return fullName;
		
	}
	
	
}
