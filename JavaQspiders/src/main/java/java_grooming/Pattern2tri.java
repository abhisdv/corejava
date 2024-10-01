package java_grooming;

public class Pattern2tri {
	public static void main(String[] args) {
		int num=3;
		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j < num*2-1; j++) {
				if ((i+j)>=num-1  && (j-i)<num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
