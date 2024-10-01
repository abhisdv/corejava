package array_pgms;

public class Sum2ndHalf2 {
	public static void main(String[] args) {
		int [] a= {3,4,6,8};
		int sum=0;
		if(a.length%2!=0) {
			System.out.println("not eligible for the logic");
		}
		else {
			for (int i = a.length/2; i < a.length; i++) {
				sum=sum+a[i];
				
			}
		}
			System.out.println("the sum of 2nd half is "+sum);
	}
}
