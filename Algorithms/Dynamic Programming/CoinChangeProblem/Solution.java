// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/sherlock-and-squares/problem

import java.util.*;

public class Solution {

    private static long getWays(long n, long[] coins) {

        long[][] table = new long[coins.length][(int) n + 1];
        table[0][0] = (coins[0] == 0) ? 1 : 0;

        for (int i = 1; i <= n; i++) {
            table[0][i] = (coins[0] == 0) ? 0 : ((i % coins[0] == 0) ? 1 : 0);
        }

        for (int i = 1; i < coins.length; i++) {
            for (int j = 0; j < table[i].length; j++) {

                if ( coins[i] > j ) {
                    table[i][j] = table[i - 1][j];

                } else if (coins[i] == j) {
                    table[i][j] = 1 + table[i - 1][j];

                } else {
                    table[i][j] = table[i - 1][j] + table[i][j - (int) coins[i]];
                }
            }
        }

        return table[coins.length - 1][(int) n];
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
        System.out.println(getWays(n, coins));
    }
}
