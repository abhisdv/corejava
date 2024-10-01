package array_pgms;

import java.util.Scanner;

public class SumarrayDynamic {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = s.nextInt();
		int []a = new int[n];
		int sum = 0;
		System.out.println("Eneter the arra values");
		int i = 0;
		do {
			a[i]= s.nextInt();
			System.out.println("Enter next value");
			i++;
		}
		while(i<= a.length-1);
		for (int j = 0; j < a.length; j++) {
			sum = sum+a[j];
		}
		System.out.println(sum);

	}
}
