package java_grooming;

public class sidePyramid {
	public static void main(String[] args) {
		int n = 3;
		for (int i = 1; i <= (2 * n)-1; i++) {
			for (int j = 1; j <= n; j++) {
				if (i>=j && i + j <=2 * n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
