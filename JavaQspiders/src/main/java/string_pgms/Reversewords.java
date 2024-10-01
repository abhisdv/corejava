package string_pgms;

import java.util.Arrays;

public class Reversewords {
	public static void main(String[] args) {

		String s = "1 am awesome but not a human";
		String[] arr = s.split(" ");
		
		int pointer = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if(pointer>i) {
			String temp=arr[i];
			arr[i]=arr[pointer];
			arr[pointer]=temp;
			}
			//System.out.println(arr[i]+" "+arr[pointer]);
			pointer--;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
