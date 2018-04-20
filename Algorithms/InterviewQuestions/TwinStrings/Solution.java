// Author: Romulo Jovelli
// Interview Question: determine if strings are twins. 
// Rule: Same characters must be at odd indexes or at even indexes. 
// e.g. the char A is at odd index in string 1 and at even index in string 2, so strings are not twins.

// sample input
// 2
// fdsa
// qazz
// 2
// asdf
// zaqz

// sample output
// [false, true]       false because fdsa and asdf are not twins, true because qazz and zaqz are twins

import java.util.*;

public class Solution {

    private static boolean[] twinStrings(String[] a, String[] b) {
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

    public static void main(String[] args) {
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
        
        System.out.println(Arrays.toString(twinStrings(a, b)));
    }
}

