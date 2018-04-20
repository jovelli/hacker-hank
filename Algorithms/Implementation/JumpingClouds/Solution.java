// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem 

import java.util.*;

public class Solution {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] c = new int[n]; 
		int position = 0, counter = 0;

		for (int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}

		for (int i = 0; i < c.length - 1;) {
			counter++;
			
			if ((i + 2) < c.length && c[i + 2] == 0) { 
				i += 2;
			} else {
				i++;
			}  
		}
		
		System.out.println(counter);
		
	}    
}

