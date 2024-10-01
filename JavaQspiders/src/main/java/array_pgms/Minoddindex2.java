package array_pgms;

public class Minoddindex2 {

	public static void main(String[] args) {
		int[] a = { 3, 6, 1, 7, 6 };
		int min = a[1];
		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				if (min > a[i]) {
					min = a[i];
				}
			}
		}
		System.out.println("the minimum value is " + min);
	}

}
