package array_pgms;

public class ReadReverse2ndHalf {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 8, 4, 9 };

		for (int i = arr.length-1 ; i >=arr.length/2; i--) {
			System.out.print(arr[i]+" ");
		}

	}
}
