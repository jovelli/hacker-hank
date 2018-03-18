// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/bon-appetit/problem

import java.util.*;

public class Solution {

    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int sum = 0, value = 0;
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
        	value = scanner.nextInt();
        	sum += (k != i) ? value : 0;
        }

        int paid = scanner.nextInt();
        scanner.close();

        System.out.println( (sum / 2) == paid ? "Bon Appetit" : (paid - (sum / 2)));
    }
}
