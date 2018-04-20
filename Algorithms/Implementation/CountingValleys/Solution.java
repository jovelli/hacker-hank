// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/counting-valleys/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();

        int controll = 0, counter = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'D') { 
                counter += (controll == 0) ? 1 : 0;
                controll--;
            }  else if (s.charAt(i) == 'U') {
                controll++;
            }
        }
        
        System.out.println(counter);
    }
}
