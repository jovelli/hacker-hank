// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/strong-password/problem

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        in.close();

        int require = 4;

        if (password.matches(".*[a-z].*")) { require--; }
        if (password.matches(".*[A-Z].*")) { require--; }
        if (password.matches(".*[0-9].*")) { require--; }
        if (password.matches(".*[\\W].*")) { require--; }

        System.out.println((n + require) > 6 ? require : 6 - n);
    }
}