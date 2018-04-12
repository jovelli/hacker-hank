// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/find-digits/problem

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int number = 0, temp = 0, each = 0, counter = 0;

        for (int i = 0; i < size; i++) {
            counter = 0;
            temp = number = in.nextInt();

            while (temp > 0) {
                each = temp % 10;
                temp /= 10;

                if (each != 0 && number % each == 0) {
                    counter++;
                }
            }

            System.out.println(counter);
        }
        in.close();
    }
}
