package commandline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class AmazonCoding {
	public static void main(String[] args) {

//		Integer priorities[] = {1,4,8,4};
		// 1,2,3,2

		// List<Integer> priorities = new ArrayList<>(Arrays.asList(1,4,8,4));

//		System.out.println(list);
		
		
		
		String str = "(?][";
		
		
		int count = 0;
		
		
		
		for (int i = 0; i < str.length(); i++) {
				
			if (str.charAt(i) == '?') {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
		
		
		

	}

	public static List<Integer> reassignedPriorities(List<Integer> priorities) {

		HashSet<Integer> set = new HashSet();

		for (int i = 0; i < priorities.size(); i++) {
			set.add(priorities.get(i));
		}

		Iterator iterator = set.iterator();

		int uniqueElement[] = new int[set.size()];

		int count = 0;

		while (iterator.hasNext()) {
			uniqueElement[count] = (int) iterator.next();
			count++;
		}

		Arrays.sort(uniqueElement);

//		System.out.println(Arrays.toString(uniqueElement));

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < uniqueElement.length; i++) {

			Integer value = i + 1;
			Integer key = uniqueElement[i];

			map.put(key, value);
		}

		System.out.println(map.get(1));

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < priorities.size(); i++) {

			list.add(map.get(priorities.get(i)));

		}

		return list;
	}

}
