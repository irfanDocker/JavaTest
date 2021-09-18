package day24_method;

import java.util.Arrays;

public class ReversestringMethod {
	
	public static void main(String[] args) {
		
//		              012
		String str = "ABCEFG";
		
		
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(0));
		
		
//		for(int i = str.length()-1; i >= 0 ; i--) {
////			System.out.println(i);
//			System.out.print(str.charAt(i));
//		}
//		
		
		
		
		StringUtil.reverseString(str);
		
		
		StringUtil.reverseString("TechCircle");
		
		
		
		String names[] = {"Opal","Nadia","Pedro","Mergen","Zamira","Famira","Qasir"};
		
		//loop the names array and reverse each name
		
		for(int i = 0 ; i < names.length; i++) {
//			System.out.println(names[i]);
			
			StringUtil.reverseString(names[i]);
		}
		
		
		
		
		
		
	}
	

	
	
	
}
