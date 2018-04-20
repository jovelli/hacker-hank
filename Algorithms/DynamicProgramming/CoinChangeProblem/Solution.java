// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/coin-change/submissions

import java.util.*;

public class Solution {


    private static long getWays(long number, long[] coins, int currentCoin) {

        if (number < 0) { 
            return 0;
        }

        if (number == 0) {
            return 1;
        }

        int result = 0;

        for (int i = currentCoin; i < coins.length; i++) {

            result += getWays(number - coins[i], coins, i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] coins = new long[m];

        for(int i=0; i < m; i++){
            coins[i] = in.nextLong();
        }
        
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        System.out.println(getWays(n, coins, 0));
    }
}

