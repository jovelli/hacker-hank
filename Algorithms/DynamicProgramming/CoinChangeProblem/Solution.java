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

// input
// 75 27
// 25 10 11 29 49 31 33 39 12 36 40 22 21 16 37 8 18 4 27 17 26 32 6 38 2 30 34

// output
// 16694
