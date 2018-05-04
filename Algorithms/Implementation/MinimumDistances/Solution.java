
// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/minimum-distances/problem

import java.util.*;

public class Solution {

	public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, Integer> map = new HashMap();
        int number = 0, min = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            number = in.nextInt();

            if (map.containsKey(number)) {
            	min = Math.min(min, i - map.get(number));
            }
            
            map.put(number, i);
        }

        in.close();

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
	}
}
