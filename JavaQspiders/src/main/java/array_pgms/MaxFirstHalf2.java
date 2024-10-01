package array_pgms;

public class MaxFirstHalf2 {
	public static void main(String[] args) {
		int [] a= {3,6,4,81,7,};
		int max=a[0];
		for (int i = 0; i < a.length/2; i++) {
		
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("the maximum value in first half is "+max);
	}
}
