package array_pgms;

public class Min2ndHalf3 {
	public static void main(String[] args) {
		int[] a = { 1, 6, 2, 7, };
		int min = a[a.length-1];
		for (int i = a.length/2; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);
		System.out.println(a.length);
	}
}
