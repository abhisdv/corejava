package array_pgms;

public class SumFirstHalf {
	public static void main(String[] args) {
		int [] a= {3,4,6,8};
		int sum=0;
		
			for (int i = 0; i < a.length/2; i++) {
				sum=sum+a[i];
				
			}
		
			System.out.println("the sum of first half is "+sum);
			System.out.println(Integer.MAX_VALUE);
	}
}
