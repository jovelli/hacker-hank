// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/countingsort2/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < n; i++) {
            array[in.nextInt()]++;
        }

        in.close();

        for (int i = 0; i < n; i++) {    
            for (int j = 0; j < array[i]; j++) {
                result.append(i + " ");
            }
        }

        System.out.println(result);
    }
}
