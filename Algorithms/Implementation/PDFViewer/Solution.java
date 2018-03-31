// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/designer-pdf-viewer/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] alphabet = new int[26];
        
        for (int i = 0; i < 26; i++) {
            alphabet[i] = in.nextInt();
        }
        in.close();
        
        String word = in.next();
        int max = 0, height = 0;
        
        for (char letter: word.toCharArray()) {
            height = alphabet[letter - 'a'];
            max = Math.max(height, max);
        }
        
        System.out.println(word.length() * max);
    }
}
