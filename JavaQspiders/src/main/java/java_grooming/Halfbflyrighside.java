package java_grooming;

public class Halfbflyrighside {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= 2*n-1; i++) {
			for (int j = 1; j <= n; j++) {
				if (j>=i ||j+i>=2*n) {
					System.out.print("x");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
