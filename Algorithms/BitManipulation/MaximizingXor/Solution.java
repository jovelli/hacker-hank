// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/maximizing-xor/problem

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		in.close();

		int count = 32 - Integer.numberOfLeadingZeros(a ^ b);

		int result = Integer.parseInt(String.format("%" + count + "s", " ").replaceAll(" ", "1"), 2);

		System.out.println(result);
	}
}
