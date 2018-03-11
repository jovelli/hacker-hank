import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        int result = 0;
        int min = IntStream.of(b).min().getAsInt();

        outer:
        for ( int j = 1; j <= min; j++ ) {
            for (int i : b) {
               if (i % j != 0) {
                  continue outer;
               }
            }

            for (int i : a) {
                if (j % i != 0) {
                    continue outer;
                }
            }

            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
