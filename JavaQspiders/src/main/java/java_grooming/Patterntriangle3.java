package java_grooming;

public class Patterntriangle3 {
	public static void main(String[] args) {
		int n = 3;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j) == (n - 1)) {
					System.out.print("x");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
