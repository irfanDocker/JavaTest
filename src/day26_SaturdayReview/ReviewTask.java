package day26_SaturdayReview;

public class ReviewTask {
	// Find the third vowel in the string and how many times this vowel occurs

	// Finding the third vowel: e

	// How many times does the third vowel occur in the string
	// 4 times

	public static void main(String[] args) {

		String str = "Welcome to TechCircle";

		String volwels = "aeiou";

		char thirdVowel = ' ';

		int numOfVowels = 0;

		System.out.println("Third vowel is " + thirdVowel);

		// Finding the third vowel: e

		for (int i = 0; i < str.length(); i++) {

			char eachChar = str.charAt(i);

//			System.out.println(eachChar);

			if (volwels.contains(Character.toString(eachChar))) {

				numOfVowels++;

				if (numOfVowels == 3) {
					System.out.println("I Found my third volwel" + eachChar);
					thirdVowel = eachChar;
				}

			}

		}

//		System.out.println(thirdVowel);

		// How many times does the third vowel occur in the string
		int count =0;

		for (int i = 0; i < str.length(); i++) {

			char eachChar = str.charAt(i);
			
			if (eachChar == thirdVowel) {
				count++;
			}

		}
		
		System.out.println("Third vowel <"+thirdVowel+"> occur in the string "+count+" times");
		
	}

}
