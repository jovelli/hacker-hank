import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0,2));
        int newHour = 0;
        String minSec = s.substring(2, s.length() - 2);
        
        if (s.contains("PM")) {
            newHour += (hour == 12) ? 12 : hour + 12;
        } else if (s.contains("AM")) {
            newHour += (hour == 12) ? 0 : hour;   
        }
        
        return String.format("%02d", newHour) + minSec;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(timeConversion(s));
    }
}