// Author: Romulo Jovelli
// Interview Question: find the first non duplicated word in a huge unordered List.

import java.util.*;

public class Solution {

	private static String[] values = {"Rua", "Casa", "Casa", "Casa", "Casa", "Casa", "Rua", "Rua", "Rua", "Rua"}; 
	private static List<String> lista = new ArrayList<String>();

	static {
		for (int i = 0; i < 10000000; i++)
		{
			if (i == 100000) {
				lista.add("UNICA_PRIMEIRA");
			}

			if (i == 2400000) {
				lista.add("UNICA_SEGUNDA");
			}

			if (i == 3500000) {
				lista.add("UNICA_TERCEIRA");
			}

			lista.add(values[(int) (Math.random() * 10)]);
		}
	}

	private static String returnFirstNonDuplicated() {
		String result = "";

		for (int i = 0; i < lista.size(); i++) {
			if (isDuplicated(lista.get(i), i)) { 
				continue;
			} else {
			 	result = lista.get(i); 
			 	break;
			}
		}

		return result;
	}

	private static boolean isDuplicated(String string, int index) {
		for (int j = 0; j < lista.size(); j++ ) {
			if (index != j && string.equals(lista.get(j))) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(returnFirstNonDuplicated());
	}	
}
