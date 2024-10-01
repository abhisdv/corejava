package array_pgms;

public class ReadReverseFirstHalf {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 8, 4, 9 };

		for (int i = arr.length/2-1 ; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}

	}
}
