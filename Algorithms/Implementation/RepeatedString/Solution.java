// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/repeated-string/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long number = in.nextLong();

        long counter = 0;
        long modulus = number % s.length();

        for (long i = 0; i < s.length(); i++)
        {
            counter += (s.charAt((int) i) == 'a') ? ((long)(number / s.length())) : 0;

			counter += (i < modulus && s.charAt((int) i) == 'a') ? 1 : 0;
        }

        System.out.println(counter);
    }
}

336123
tHF8204