package string_pgms;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "vaja";
		boolean val = true;
		if (s1.length() == s2.length()) {
			char[] ar1 = s1.toCharArray();
			Arrays.sort(ar1);
			char[] ar2 = s2.toCharArray();
			Arrays.sort(ar2);
			for (int i = 0; i < ar2.length; i++) {
				if (ar1[i] != ar2[i]) {
					val = false;
					System.out.println("not anagrams");
					//break;
				}
			}
			if (val == true) {
				System.out.println("anagrams");
			}
		}else {
			System.out.println("not eligible for logic");
		}
	}
}
