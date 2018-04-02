// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/strange-advertising/problem

import java.util.*;

public class Solution {

    private static int viralAdvertising(int n, int days) {
        return ( days == 0 ) ? 0 : ((n >> 1) + viralAdvertising(((n >> 1) * 3), --days));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println(viralAdvertising(5, in.nextInt()));
        in.close();
    }
}
