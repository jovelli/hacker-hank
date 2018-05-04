// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/angry-professor/problem

import java.util.Scanner;

public class Solution {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();

		// for first element, if it's a thunderhead or cumulus cloud.
		int result = 100 - ((in.nextInt() == 0) ? 1 : 3);
		int value = 0;

		while (--n > 0) {
			value = in.nextInt();
		
			if (n % k == 0) {
				result--;

				if (value == 1) {
					result -= 2;
				}
			}
		}

		System.out.println(result);
	}
}

