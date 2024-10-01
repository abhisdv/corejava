package string_pgms;

import java.util.Arrays;

public class Rotateone {
	public static void main(String[] args) {
		String s= "hello java";
		char [] arr= s.toCharArray();
		char temp1=arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			arr[i]=arr[i+1];			
		}
		arr[s.length()-1]= temp1;
		System.out.println(Arrays.toString(arr));
	}
}
