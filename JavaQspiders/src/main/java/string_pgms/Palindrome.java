package string_pgms;

public class Palindrome {
	public static void main(String[] args) {
		String s = "abcbad";
		int pt = s.length()-1;
		char[] ar = s.toCharArray();
		boolean ans = true;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != ar[pt]) {
				ans = false;
				System.out.println("not a palindrome");
				break;
			}
			pt--;
		}
		if(ans==true) {
			System.out.println("the string is palindrome");
		}
	}

}
