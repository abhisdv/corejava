package string_pgms;

import java.util.Arrays;

public class Reverse_str {
	public static void main(String[] args) {
		String s="hello";
		char [] arr= s.toCharArray();
		int p=arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			if(p>i) {
				char temp=arr[i];
				arr[i]=arr[p];
				arr[p]=temp;
			}
			p--;
		}
		String snew=Arrays.toString(arr);
		System.out.println(snew);
	}
}
