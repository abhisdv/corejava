package java_grooming;

public class HalfbutterFly {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= 2*n-1; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j<=n+1 || i-j>=n-1) {
					System.out.print("x");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
