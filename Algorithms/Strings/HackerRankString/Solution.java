// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        while ( q-- > 0) {  System.out.println(in.next().matches(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*") ? "YES" : "NO"); }
        in.close();
    }
}
