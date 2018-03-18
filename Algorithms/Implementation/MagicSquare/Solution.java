// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/magic-square-forming/problem

import java.util.*;

public class Solution {

    // https://en.wikipedia.org/wiki/Magic_square
    // All possible magic squares basend in a matrix 3x3 with distinct numbers between [1, 9]
    private static int[][] possible = {
        { 2, 9, 4, 7, 5, 3, 6, 1, 8 },
        { 2, 7, 6, 9, 5, 1, 4, 3, 8 },
        { 4, 9, 2, 3, 5, 7, 8, 1, 6 },
        { 4, 3, 8, 9, 5, 1, 2, 7, 6 },
        { 6, 7, 2, 1, 5, 9, 8, 3, 4 },
        { 6, 1, 8, 7, 5, 3, 2, 9, 4 },
        { 8, 1, 6, 3, 5, 7, 4, 9, 2 },
        { 8, 3, 4, 1, 5, 9, 6, 7, 2 }
    };

    private static int formingMagicSquare(int[][] s) {
        int result = Integer.MAX_VALUE;

        for ( int i = 0; i < 8; i++ ) {
            int count = 0;
            count += Math.abs(possible[i][0] - s[0][0]) + Math.abs(possible[i][1] - s[0][1]) + Math.abs(possible[i][2] - s[0][2]);
            count += Math.abs(possible[i][3] - s[1][0]) + Math.abs(possible[i][4] - s[1][1]) + Math.abs(possible[i][5] - s[1][2]);
            count += Math.abs(possible[i][6] - s[2][0]) + Math.abs(possible[i][7] - s[2][1]) + Math.abs(possible[i][8] - s[2][2]);

            result = (count < result) ? count : result;
        }  

        return (result == Integer.MAX_VALUE) ? 0 : result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];

        int result = 0, value = 0;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                s[i][j] = in.nextInt();
            }
        }
        
        in.close();

        System.out.println(formingMagicSquare(s));
    }
}
