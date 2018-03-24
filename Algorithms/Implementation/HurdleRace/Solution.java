// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/the-hurdle-race/problem

import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int result = 0;

        while (n-- > 0) { result = Math.max(result, ( in.nextInt() - k )); }
        
        in.close();

        System.out.println(result);
    }
}
