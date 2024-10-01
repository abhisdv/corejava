package array_pgms;

import java.util.Arrays;

public class SwapArrayBytwoIndex {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 8, 4 };
		int ind1=3;
		int ind2=1;
		String s=Arrays.toString(arr);
		System.out.println(s);
		int temp=arr[ind1];
		arr[ind1]=arr[ind2];
		arr[ind2]=temp;
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
