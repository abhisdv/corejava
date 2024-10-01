package java_grooming;
/*
xxx
x
x

  
 */

public class Pattern_triangle2 {
	public static void main(String[] args) {
		int num =3;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(i==0||j==0)
				System.out.print("x");				
			}
			System.out.println();
		}
	}
}
