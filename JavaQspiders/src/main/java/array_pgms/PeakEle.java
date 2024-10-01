package array_pgms;

public class PeakEle {
	public static void main(String[] args) {
		int[] a= {1,4,2,7,8};
		if(a[0]>a[1]) {
			System.out.println(a[0]);
		}
		if(a[a.length-1]>a[a.length-2]) {
			System.out.println(a[a.length-1]);
		}
		for (int i = 1; i < a.length-1; i++) {
			if(a[i]>a[i-1]&&a[i]>a[i+1]) {
				System.out.println(a[i]);
			}
			
		}
	}
}
