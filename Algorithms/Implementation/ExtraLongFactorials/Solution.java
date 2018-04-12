// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/extra-long-factorials/problem

import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = new BigInteger(String.valueOf(in.nextInt()));
        BigInteger result = BigInteger.ONE;
        in.close();

        while (n.longValue() > 0) {
        	result = result.multiply(n);
        	n = n.subtract(BigInteger.ONE);
        }
        
        System.out.println(result);
    }
}
	