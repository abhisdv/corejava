package array_pgms;

public class MinFirstHalf2 {
	public static void main(String[] args) {
		int[] a = { 3, 6, 1, 7, };
		int min = a[0];
		for (int i = 0; i < a.length/2; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
}
