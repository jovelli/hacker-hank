// Author: Romulo Jovelli
// Interview Question: generate fake values for numbers (#), letters (?) or both numbers (#) and letters (?).

import java.util.*;

public class Solution {

	private static final int BETWEEN_LETTERS = 7;
	private static final Random RANDOM = new Random();
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
		String result = "";

		if (string.contains("#") && string.contains("?")) {
			result = bothify(string);

		} else if (string.contains("#")) {
			result = numberify(string);

		} else if (string.contains("?")) {
			result = letterify(string);
		}

		System.out.println(result);
	}	

	private static String bothify(String string) {
		String temp = numberify(string);
		String result = letterify(temp);

		return result;
	}	

	private static String numberify(String string) {
		char[] chars = string.toCharArray();
		int value = 0;

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '#') { 
				value = '0' + RANDOM.nextInt(10);
				chars[i] = (char) value;
 			}
		}

		return new String(chars);
	}

	private static String letterify(String string) {
		char[] chars = string.toCharArray();
		int value = 0, random = 0;

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '?') { 
				random = RANDOM.nextInt(51);
				value = 'A' + ((random > 25) ? BETWEEN_LETTERS + random : random); 
				chars[i] = (char) value;
			} 
		}

		return new String(chars);
	}
}
