//Author: Romulo Jovelli
//HackerHank: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

import java.util.*;

public class Solution {

    private static String breakingRecords(int[] score) {
        int min = score[0];
        int max = score[0];
        int maxCount = 0, minCount = 0;

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
                maxCount++;
            }

            if (score[i] < min) {
                min = score[i];
                minCount++;
            }
        }

        return (maxCount + " " + minCount);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];

        for(int i = 0; i < n; i++){
            score[i] = in.nextInt();
        }
        
        System.out.println(breakingRecords(score));
    }
}
