package array_pgms;

import java.util.Scanner;

public class Min_value {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = s.nextInt();
		int min=0;
		if (size <= 0) {
			System.out.println("enter only positive integer");
		} else {
			System.out.println("inside elsse10");
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("enter the data");
				arr[i] = s.nextInt();
			}
			 min=arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
				}
				
			}
		}System.out.println(min+" is the smallest number");
	}
}
