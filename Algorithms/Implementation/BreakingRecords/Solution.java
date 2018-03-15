//Author: Romulo Jovelli
//HackerHank: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

import java.util.*;

public class Solution {

    private static String breakingRecords(int[] scores) {
        int min = scores[0];
        int max = scores[0];
        int maxCount = 0, minCount = 0;

        for (int score: scores) {
            if (score > max) {
                max = score;
                maxCount++;
            }

            if (score < min) {
                min = score;
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
