// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/cats-and-a-mouse/problem

import java.math.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            
            if ( Math.abs(z - x) == Math.abs(z - y) ) {
                result.append("Mouse C");
            } else if ( Math.abs(z - x) > Math.abs(z - y) ) {
                result.append("Cat B"); 
            } else {
                result.append("Cat A");
            }
            
            result.append("\n");
        }
        
        scan.close();

        System.out.println(result.toString());
    }
}
