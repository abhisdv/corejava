package array_pgms;

public class Max2nd {
	public static void main(String[] args) {
		int[] a = { 3, 6, 1, 7, };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		int max2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != max && a[i] > max2) {

				max2 = a[i];

			}
		}

		System.out.println(max2);

	}

}
