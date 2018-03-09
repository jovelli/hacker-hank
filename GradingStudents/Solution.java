
import java.util.*;

public class Solution {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        List result = solve(grades);
        result.forEach(System.out::println);	
	}

	private static List solve(int[] grades) {
		List<Integer> result = new ArrayList();
		int value = 0, j=-1;

		for (int i=0; i < grades.length; i++) {
			value = grades[i];

			if (value >= 38) {
				value = (value % 5 >= 3) ? value + 5 - (value % 5) : value;
			}
			result.add(value);
		}

		return result;
	}
}
