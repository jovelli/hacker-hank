// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/migratory-birds/problem

import java.util.*;

public class Solution {

    private static int migratoryBirds(int[] array) {
        int index = 0;
        int[] group = new int[6];

        for (int bird: array) {
            group[bird]++;

            if (group[bird] > group[index] || (group[bird] == group[index] && bird < index)) {
                index = bird;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] input = new int[n];

        for(int i = 0; i < n; i++){
            input[i] = in.nextInt();
        }

        System.out.println(migratoryBirds(input));
    }
}
