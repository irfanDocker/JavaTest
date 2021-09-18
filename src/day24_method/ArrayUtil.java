package day24_method;

import java.util.Arrays;

public class ArrayUtil {
	
	
	public static void combine2Array(int numArr1[], int numArr2[]) {
		
//		int numArr1[] = {1,3,5,7,9};
//		int numArr2[] = {2,4,6,8};
		
		int numArr3[] = new int[numArr1.length + numArr2.length];
		
//		
//		System.out.println(numArr3.length);
//		System.out.println(Arrays.toString(numArr3));
		
		int position = 0;
		
		for (int num : numArr1) {
			numArr3[position] = num;
			position++;
			
		}
		
//		System.out.println(Arrays.toString(numArr3));
		
		for (int num : numArr2) {
			numArr3[position] = num;
			position++;
			
		}
		
		System.out.println(Arrays.toString(numArr3));
		
	}
	
	
	
}
