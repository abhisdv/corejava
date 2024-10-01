package array_pgms;

import java.util.Arrays;

public class ReverseOddIndex {
	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		int i=0;
		int j=a.length-1;
		if(a.length%2==0) {
			j=a.length-2;
		}
		while(i<j) {
			if(i%2==0 && j%2==0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(a));
	}
}
