// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/designer-pdf-viewer/problem

import java.util.*;
import java.math.*;

public class Solution {
    
    private static char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Character, Integer> alphabet = new HashMap();
        
        for(int i = 0; i < 26; i++){
            alphabet.put(letters[i], in.nextInt());
        }
        
        String word = in.next();
        int max = 0, height = 0;
        
        for (char letter: word.toCharArray()) {
            height = alphabet.get(letter);
            max = Math.max(height, max);
        }
        in.close();
        
        System.out.println(word.length() * max);
    }
}
