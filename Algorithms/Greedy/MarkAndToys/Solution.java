// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/mark-and-toys/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] prices = new int[n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }
        
        in.close();

        Arrays.sort(prices);

        for (int i = 0; i < n && k - prices[i] >= 0; i++) {
            k -= prices[i];
            result++;
        }

        System.out.println(result);
    }
}
