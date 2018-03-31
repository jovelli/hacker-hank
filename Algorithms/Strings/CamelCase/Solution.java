// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/camelcase/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();

        int result = 0;

        for (char c: s.toCharArray()) {
        	if (c >= 'A' && c <= 'Z') {
        		result++;
        	}
        }

        System.out.println(++result);        
    }
}
