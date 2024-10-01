package java_grooming;

public class Pyramidbackarrow {
	public static void main(String[] args) {
		int n = 3;
		for (int i = 1; i <= (2 * n)-1; i++) {
			for (int j = 1; j <= n; j++) {
				if (i-j<n  &&i+j>n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
//&& i + j <=2*n