// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/mars-exploration/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int result = 0;
        char[] chars = s.toCharArray();
        char letter = 0;
        
        for (int i = 0; i < chars.length; i++) {
            letter = (i % 3 == 1) ? 'O' : 'S';
            result += (chars[i] != letter) ? 1 : 0; 
        }
        
        System.out.println(result);
        in.close();
    }
}
