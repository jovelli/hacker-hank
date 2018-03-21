// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/picking-numbers/problem

import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] count = new int[100];
        int result = 0;

        for (int i = 0; i < n; i++) {
            count[ in.nextInt() ]++;
        }

        in.close();

        for (int j = 0; j < count.length - 1; j++) {
            result = Math.max(result, count[j] + count[j + 1]);
        }

        System.out.println(result);
    }
}


