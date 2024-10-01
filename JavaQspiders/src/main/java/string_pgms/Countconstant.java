package string_pgms;

public class Countconstant {
	public static void main(String[] args) {
		String s = "Abhishek";
		int countcons = 0;
		String svow = "aeiouAEIOU";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 || s.charAt(i) <= 90 || s.charAt(i) >= 97 || s.charAt(i) <= 122) {
				if (!(svow.contains(s.charAt(i) + ""))) {
					countcons++;
				}
			}

		}
		System.out.println("the number of constants are " + countcons);
		// System.out.println((int)'a');
	}

}
