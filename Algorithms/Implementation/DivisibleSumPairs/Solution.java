// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/divisible-sum-pairs/problem

import java.util.*;

public class Solution {

    /*
       I am using buckets to keep track if previous evaluated value is a reminder complement of current evaluated value.
       if it is, so we have a match of two numbers that sum result is reminder 0.

       For example divisible number is 3.
        
       For each value from input array, I get the reminder of array[i] % 3. 
       
       This reminder is an index in result array and it is incremented.

       count is incremented by array[3 - reminder], or if reminder is 0, so array[0].
    */

    private static int divisibleSumPairs(int k, int[] array) {
        int count = 0;
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            
            int number = array[i] % k;

            count += result[(k - number) % k];
            result[number] += 1;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = in.nextInt();
        }

        System.out.println(divisibleSumPairs(k, array));
    }
}
