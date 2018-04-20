// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/lonely-integer/problem

import java.util.*;

public class Solution {
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		//XOR solution, 
		int result = 0;

		for (int i = 0; i < n; i++) {
			result = result ^ in.nextInt();			
		}

		System.out.println(result);
	}
}

