// Author: Romulo Jovelli
// HackerHank: https://www.hackerrank.com/challenges/day-of-the-programmer/problem

import java.util.*;

public class Solution {

	private static final int FIXED_DAYS_JAN_TO_SEP = 215;
	private static final int PROGRAMMER_DAYS = 256;
	private static final int MONTH = 9;

    private static String solve(int year) {    	
    	int days = PROGRAMMER_DAYS - FIXED_DAYS_JAN_TO_SEP - getFebruary(year);
    	
    	return new String(String.format("%02d", days) + "." + String.format("%02d", MONTH) + "." + year);
    }

    private static int getFebruary(int year) {
		if ( year <= 1917 ) { return (year % 4 == 0) ? 29 : 28; } 
    	if ( year == 1918 ) { return 15; }

    	return (year % 400 == 0 || (year % 4 == 0) && (year % 100 != 0)) ? 29 : 28;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        System.out.println(solve(year));
    }
}
