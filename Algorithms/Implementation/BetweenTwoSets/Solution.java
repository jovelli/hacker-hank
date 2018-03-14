// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/between-two-sets/problem

import java.util.stream.*;
import java.util.*;

public class Solution {

    private static int getBetweenTwoSets(int[] a, int[] b) {
        int result = 0;
        int min = IntStream.of(b).min().getAsInt();

        outer:
        for ( int j = 1; j <= min; j++ ) {
            for (int i : b) {
               if (i % j != 0) {
                  continue outer;
               }
            }

            for (int i : a) {
                if (j % i != 0) {
                    continue outer;
                }
            }

            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = in.nextInt();
        }

        System.out.println(getBetweenTwoSets(a, b));

    }
}
