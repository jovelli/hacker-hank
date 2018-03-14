// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/apple-and-orange/problem

import java.util.stream.*;
import java.util.*;

public class Solution {

    private static String countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        long feltApples = Arrays.stream(apples).filter(apple -> (a + apple) >= s && (a + apple) <= t).count();
        long feltOranges = Arrays.stream(oranges).filter(orange -> (orange + b) >= s && (orange + b) <= t).count();

        return feltApples + "\n" + feltOranges;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        int[] apple = new int[m];
        for(int i = 0; i < m; i++) {
            apple[i] = in.nextInt();
        }

        int[] orange = new int[n];
        for(int i = 0; i < n; i++) {
            orange[i] = in.nextInt();
        }

        System.out.println(countApplesAndOranges(s, t, a, b, apple, orange));
    }
}
