// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/angry-professor/problem

import java.util.*;

public class Solution {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);

		int cases = in.nextInt();
		int counter = 0;
			
		while (cases-- > 0) {
			int n = in.nextInt();
			int threshold = in.nextInt();
			counter = 0;
			
			while (n-- > 0) {
				if (in.nextInt() <= 0) { counter++; }	
			}

			System.out.println(counter >= threshold ? "NO" : "YES"); 
		}
	}
}
