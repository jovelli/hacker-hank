// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/designer-pdf-viewer/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] counter = new int[101];

        int max = 0;

        for (int i = 0; i < n; i++) {
        	max = Math.max(max, ++counter[in.nextInt()]);
        }

        in.close();

        System.out.println(n - max);
    }
}
