// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/sock-merchant/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] counter = new int[101];
        int result = 0;

        while ( n-- > 0 ) {
        	result += counter[in.nextInt()]++ % 2;
        }

        in.close();

        System.out.println(result);
    }	
}
