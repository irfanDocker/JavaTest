package day26_SaturdayReview;

import java.util.ArrayList;
import java.util.Arrays;

public class Tasks {
	public static void main(String[] args) {

//		create a method that can print out the maximum number from any given integer array
//		create a function that can print out the minimum number from any given integer array
//		create a function that can print the unique elements from the array

//		ArrayList<Integer> list = new ArrayList<>();
//		list.contains(o)
		
		
		
		/*
	    step1: print hello 5 times  (for loop)
		step2: print your name
		step3: print hello 5 times  (for loop)
		step4: print your school name
		step5: print hello 5 times   (for loop)
       */
		
		

//		int[] nums = { 1, 5, 66, 9, 55 };
//		System.out.println(maximumNumber(nums));
//
//		int[] nums1 = { 1, 5, 6, 9, 55, 0 };
//		System.out.println(minimumNumber(nums1));
//
//		maximumNumber1(nums);
//		minimumNumber1(nums1);
//		
//		int[] nums2 = { 1, 5, 6, 9, 55, 0 ,5, 6, 9, 55, 0};
//		
//		
//		ArrayList<Integer> list = uniqueElements(nums2);
//		
//		System.out.println(list);
		
		
		
		
		
		
		
		/*
	    step1: print hello 5 times  (for loop)
		step2: print your name
		step3: print hello 5 times  (for loop)
		step4: print your school name
		step5: print hello 5 times   (for loop)
       */
		
		
		
		
//		 task();
		
		
//		How to get distinct() characters and their count in a String?
		
//		How to merge two lists in java?
		
//		List1 =  {1,2,3,4,5,6,7}
//		list2 = {11,22,33,44,55,66,77}
		
//		create a method to merge 2 list, and return the sum of all the numbers
		
		
		
//		Sum of all elements in integer array?
//				It's a very simple program. We can use for loop to iterate over the array elements and add them to get the final sum.
		
		
		
		
		
		
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 66, 77));
		mergeAndTotal(list1, list2);
		
		
		//Java Program to check if a vowel is present in the string?
		// a,e o,i u
		
		System.out.println();
		

		
		String hello = "Hlleeeeeeee";
		
		
		if (checkVowel(hello)) {
			System.out.println(hello +" contains vowel");
		}else {
			System.out.println(hello +" doesn't contains vowel");
		}
		
//		Palindrome Check
		
//		
//		CIVIC
//		ANNA
		
		
		String str = "HANNAH";
		
		
//		if (str.equals(reverseString(str))) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not a Palindrome");
//		}
		
		
		System.out.println(isPalindrome("CIVIC"));
		
		System.out.println(isPalindrome("DINA"));
		
		
		System.out.println(isPalindrome("ANNA"));
		

	}
	
	
	
	public static boolean isPalindrome(String str) {
		if (str.equals(reverseString(str))) {
//			System.out.println("Palindrome");
			return true;
		}else {
//			System.out.println("Not a Palindrome");
			return false;
		}
	}
	
	
	
	public static String reverseString(String str) {
//		String str = "TechCircle";
		
		String reversedStr = "";
		
		for(int i = str.length()-1; i >=0 ; i--) {
			reversedStr += str.charAt(i);
		}
		
		
		return reversedStr;
//		System.out.println(reversedStr);
//		
//		
//		
//		StringBuilder sb = new StringBuilder();
//		
//		sb.append(str);
//		
//		System.out.println(sb.reverse());
		
	}
	
	
	
	
	public static boolean checkVowel(String str) {
		char a = 'a';
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';
	
		boolean isVowel = false;
//		String str = "";
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
//			System.out.println(ch);
			if(ch == a || ch == e || ch == i || ch == o || ch == u) {
				isVowel = true;
			}
		
		}
//			System.out.println(isVowel);
			
			return isVowel;
		
	}
	
	
	public static void mergeAndTotal(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		
		int total = 0;
		for (int i = 0; i < list3.size(); i++) {
			total += list3.get(i);
		}
		System.out.println(list3);
		System.out.print(total);
	}
	
	
	
	
	public static void hello5Times() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("hello");
		}
		System.out.println();
	}
	
	public static void task() {
		String name = "Pedro";
		String school = "TechCircle";
		hello5Times();
		System.out.println("Name: " + name);
		hello5Times();
		System.out.println("School name: " + school);
		hello5Times();
	}
	
//	public static void uniqueElements(int arr[]) {
//		ArrayList<Integer> list = new ArrayList<>();
//		for (int i = 0; i < arr.length; i++) {
//			if (!list.contains(arr[i])) {
//				list.add(arr[i]);
//			}
//		}
//		System.out.println(list);
//	}
	
	
	
	public static ArrayList<Integer> uniqueElements(int arr[]) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		
		return list;
	}
	
	

	public static void maximumNumber1(int arr[]) {
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 1]);
	}

	public static void minimumNumber1(int arr[]) {
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}

	public static int maximumNumber(int nums[]) {
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}

	public static int minimumNumber(int nums1[]) {
		int max = nums1[0];
		for (int i = 0; i < nums1.length; i++) {
			if (nums1[i] < max) {
				max = nums1[i];
			}
		}
		return max;
	}

}
