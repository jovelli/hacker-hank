import java.util.stream.*;
import java.util.*;

public class Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        long feltApples = Arrays.stream(apples).filter(apple -> (a + apple) >= s && (a + apple) <= t).count();
        long feltOranges = Arrays.stream(oranges).filter(orange -> (orange + b) >= s && (orange + b) <= t).count();

        System.out.println(feltApples + "\n" + feltOranges);
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
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}