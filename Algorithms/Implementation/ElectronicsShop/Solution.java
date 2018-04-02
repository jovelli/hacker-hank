// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/electronics-shop/problem

import java.util.*;

public class Solution {

    private static int getMoneySpent(int[] keyboards, int[] drives, int s){
        int result = -1;

        for (int i = 0; i < keyboards.length; i++) {
        	for (int j = 0; j < drives.length; j++) {
        		if (keyboards[i] + drives[j] <= s) {
        			result = Math.max(result, keyboards[i] + drives[j]);
        		}
        	}
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();

        int[] keyboards = new int[n];
        for(int i=0; i < n; i++){
            keyboards[i] = in.nextInt();
        }

        int[] drives = new int[m];
        for(int j=0; j < m; j++){
            drives[j] = in.nextInt();
        }

        System.out.println(getMoneySpent(keyboards, drives, s));
    }
}