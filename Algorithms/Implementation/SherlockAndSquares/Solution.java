// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/sherlock-and-squares/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0, b = 0, result = 0;

        for (int i = 0; i < n; i++) {
            a = in.nextInt();
            b = in.nextInt();

            System.out.println((int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1));
        }
        in.close();
    }
}
