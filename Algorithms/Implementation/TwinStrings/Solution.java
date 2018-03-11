import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    /**
     * Complete the function below.
     * DO NOT MODIFY anything outside this method. 
     */
    static boolean[] twins(String[] a, String[] b) {
        boolean[] result = new boolean[a.length];
        char[] first = null, second = null;
        char temp = 0;
        
        outer:
        for (int i = 0; i < a.length; i++) {
            
            first = a[i].toCharArray();
            second = b[i].toCharArray();

            if (first.length != second.length) {
                result[i] = false;
                continue outer;
            }

            inner:
            for (int j = 0; j < first.length; j++) {
                for (int k = j; k < second.length; k += 2) {
                    if (first[j] == second[k]) {
                        temp = second[j];
                        second[j] = second[k];
                        second[k] = temp;

                        continue inner;
                    }
                }

                result[i] = false;
                continue outer;
            }

            result[i] = true;
        }

        return result;
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
        
        int m = Integer.parseInt(in.nextLine().trim());
        String[] b = new String[m];
        for(int i = 0; i < m; i++) {
            b[i] = in.nextLine();
        }
        
        // call twins function
        boolean[] results = twins(a, b);
        
        for(int i = 0; i < results.length; i++) {
            System.out.println(results[i]? "Yes" : "No");
        }
    }
}

