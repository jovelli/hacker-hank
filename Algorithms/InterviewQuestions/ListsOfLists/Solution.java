// Author: Romulo Jovelli

// Receives a list of lists and return lists concatenated. Example:
// 	- input: List1 a b c, List2 1 2 3, List3 d e f
//
// 	- output: a1d, a1e, a1f, a2d, a2e, a2f, a3d, a3e, a3f
// 	          b1d, b1e, b1f, b2d, b2e, b2f, b3d, b3e, b3f
// 	          c1d, c1e, c1f, c2d, c2e, c2f, c3d, c3e, c3f  
// 		  

import java.util.*;

public class Solution {

    private static List<String> concatenateLists(List<List<String>> lists) { 

		if (lists.size() == 1) {
			return lists.get(0);
		}
	
		List<String> list = lists.remove(0);
		List<String> list2 = concatenateLists(lists);

		List<String> result = new ArrayList();
	
		for (String str: list) {
			for (String str2: list2) {
				result.add(str + str2);
			}
		}

        return result;
    }

    public static void main(String[] args) {
		List<List<String>> main = new ArrayList();
		
		List<String> list1 = new ArrayList();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		List<String> list2 = new ArrayList();
		list2.add("1");
		list2.add("2");
		list2.add("3");
	
		List<String> list3 = new ArrayList();
		list3.add("d");
		list3.add("e");
		list3.add("f");

		List<String> list4 = new ArrayList();
		list4.add("4");
		list4.add("5");
		list4.add("6");

		main.add(list1);
		main.add(list2);
		main.add(list3);
		main.add(list4);

		System.out.println(concatenateLists(main)); 
    }
}

