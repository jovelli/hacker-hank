// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/kangaroo/problem

import java.util.*;

public class Solution {

    private static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = "NO";

        if ( v1 > v2 && x2 > x1 ) {
            if ((x2 - x1) % (v1 - v2) == 0) {
                result = "YES";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        System.out.println(kangaroo(x1, v1, x2, v2));
    }
}
