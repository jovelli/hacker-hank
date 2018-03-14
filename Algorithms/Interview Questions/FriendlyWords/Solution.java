// Author: Romulo Jovelli
// Interview Question: find anagrams, group and show them both sorted by group and strings. If string doesn't match any other, don't show it.

// sample input 
// 10                        
// casa
// fdsa
// saca
// test
// este
// ttse
// amor
// stes
// roma
// omar

// sample output
// amor omar roma 
// casa saca 
// test ttse

import java.util.*;

public class Solution {

    private static SortedSet<String> result = new TreeSet();

    private static String[] friendlyWords(String[] input) {
        List<String> list = new ArrayList(Arrays.asList(input));
    	SortedSet<String> group = new TreeSet();
    	String string2 = "", finalResult = "";
    	
		String string1 = list.get(0);
    	
    	for (int j = 1; j < list.size(); j++) {
    		string2 = list.get(j);

    		if (isValid(string1, string2) && isFriendly(string1, string2)) {
                group.add(string2);
    		}
    	}

        list.remove(string1);

        if (group.size() > 0) {
            list.removeAll(group);

            finalResult += string1 + " ";
            for (String string: group) {
                finalResult += string + " ";
            }

            result.add(finalResult);            
        }

        if (list.size() > 1) { 
            friendlyWords(list.toArray(new String[list.size()]));
        } 

        return result.toArray(new String[result.size()]);
    }

    private static boolean isFriendly(String a, String b) {
        char temp = 0, first = 0, second = 0;

        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();

        outer:
        for (int i=0; i < array1.length; i++) {
            first = array1[i];
                 
            for (int j=i; j < array2.length; j++) {
                second = array2[j];

                if (isValid(first) && isValid(second) && first == second) {
                    temp = array2[i];
                    array2[i] = array2[j];
                    array2[j] = temp;
                    continue outer;
                }
            }

            return false;
        }
        
        return true;
    }

    private static boolean isValid(String string1, String string2) {
        return (null != string1) && (null != string2) && (string1.length() == string2.length()); 
    }

    private static boolean isValid(char c) {
        return (c != 0 || c != ' '); 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine().trim());
        String[] a = new String[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextLine();
        }
        
        Arrays.stream(friendlyWords(a)).forEach(System.out::println);
    }
}
