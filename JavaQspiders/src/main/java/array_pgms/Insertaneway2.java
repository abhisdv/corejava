package array_pgms;

public class Insertaneway2 {
	public static void main(String[] args) {
		int[] a = { 3, 6, 1 };
		int anew[] = new int[a.length + 1];
		int index = 2;
		int insert = 15;
		int count = 0;
		for (int i = 0; i < anew.length; i++) {
			if (i != 2) {
				anew[i] = a[count];
				count++;
			} else {
				anew[i] = insert;
			}

		}
		for (int j : anew) {
			System.out.println(j + " ");
		}
	}
}
