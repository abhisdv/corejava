package array_pgms;

public class ArraysSort {
	public static void main(String[] args) {
		int[] a= {4,5,6,2,9};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
		
	}
}
