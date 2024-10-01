package array_pgms;

public class MaxOArray {
	public static void main(String[] args) {
		int [] a= {3,6,1,7,};
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
		
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("the maximum value is "+max);
	}
}
