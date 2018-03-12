import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.*;

public class Solution {

    private static SortedSet<String> result = new TreeSet();

    static String[] friendlyWords(String[] input) {
        List<String> list = new ArrayList(Arrays.asList(input));
    	SortedSet<String> group = new TreeSet();
    	String string1 = null, string2 = null, finalResult = "";
    	
		string1 = list.get(0);
    	
    	for (int j = 1; j < list.size(); j++) {
    		string2 = list.get(j);

    		if (isValid(string1, string2) && isFriendly(string1, string2)) {
    			group.add(string1);
                group.add(string2);
    		}
    	}

        list.remove(string1);

        for (String string: group) {
            list.remove(string);
            finalResult += string + " ";
        }

        result.add(finalResult);

        if (list.size() > 1) { 
            friendlyWords(list.toArray(new String[list.size()]));
        } 

        return result.toArray(new String[result.size()]);
    }

    static boolean isFriendly(String a, String b) {
        char temp = 0, first = 0, second = 0;

        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();

        outer:
        for (int i=0; i < array1.length; i++) {
            first = array1[i];
                 
            for (int j=i; j < array2.length; j++) {
                second = array2[j];

                if (!isValid(first) && !isValid(second) && first == second) {
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

    static boolean isValid(String string1, String string2) {
        return (null != string1) && (null != string2) && (string1.length() == string2.length()); 
    }

    static boolean isValid(char c) {
        return (c == 0 || c == ' '); 
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine().trim());
        String[] a = new String[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextLine();
        }
        
        LocalDateTime start = LocalDateTime.now();
        Arrays.stream(friendlyWords(a)).forEach(System.out::println);

        System.out.println(Duration.between(start, LocalDateTime.now()));
    }
}
