package java_grooming;

public class Half_butterfly {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (i>=j || j+i>=2*n) {
					System.out.print("x");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
