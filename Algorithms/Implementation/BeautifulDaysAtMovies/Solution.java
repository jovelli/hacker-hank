// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

import java.util.*;

public class Solution {

	private static int reverse(int n) {
		int result = 0;

        while (n > 0) {
        	result = result * 10 + n % 10;
        	n /= 10;
        }

        return result;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        in.close();

        int counter = 0;

        while (i <= j) {
            counter += Math.abs(i - reverse(i)) % k == 0 ? 1 : 0;
            i++;
        }
        
        System.out.println(counter);
    }
}
