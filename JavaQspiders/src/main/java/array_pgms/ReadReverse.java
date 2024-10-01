package array_pgms;

import java.util.Arrays;

public class ReadReverse {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 8, 4, 9 };
		
		for (int i = arr.length-1 ; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}

	}
}
