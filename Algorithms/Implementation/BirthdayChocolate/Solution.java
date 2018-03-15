// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/the-birthday-bar/forum/problem

import java.util.*;

public class Solution {

    private static int solve(int[] s, int d, int m){
        int result = 0, acc = 0;

        for (int i = 0; i < s.length; i++) {
            acc += s[i];

            if (i >= m) {
                acc -= s[i - m];        // sliding window, remove value from left of the list.
            }

            if (acc == d) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];

        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();

        System.out.println(solve(s, d, m));
    }
}
