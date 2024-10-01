package string_pgms;

import java.util.Arrays;

public class Anagram2 {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "vaja";
		boolean val = true;
		if (s1.length() == s2.length()) {
		
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i)!= s2.charAt(i)) {
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
