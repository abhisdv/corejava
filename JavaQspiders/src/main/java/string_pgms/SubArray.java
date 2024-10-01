package string_pgms;

public class SubArray {
	public static void main(String[] args) {
		int[] arr = { 3, 6, 1, 9, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = i; k <= j; k++) {

					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
			// System.out.println();

		}
	}

}
