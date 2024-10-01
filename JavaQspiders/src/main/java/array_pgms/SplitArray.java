package array_pgms;

public class SplitArray {
	public static void main(String[] args) {
		int[] arr = { 4, 6, 2, 5, 87, 34, 65,49};
		int[] a1 = new int[arr.length / 2];
		int[] a2 = new int[arr.length / 2];
		int count=0;
		if (arr.length % 2 == 0) {
			for (int i = 0; i < arr.length; i++) {
				if (i < arr.length / 2) {
					a1[i] = arr[i];
				} else {
					a2[count] = arr[i];
					count++;
				}

			}
		} else {
			System.out.println("the array is not eligible for logic");
		}
		System.out.println("values in 2nd half of the array");
		for (int i : a2) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("values in 1st half of the array");
		for (int i : a1) {
			System.out.print(i+" ");
		}
	}
}
