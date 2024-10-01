package array_pgms;

public class Avgevenindex2 {
	public static void main(String[] args) {
		int [] arr= {3,5,2,8,4};int sum=0;int count=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(i%2==0) {
			sum+=arr[i];
			count++;
			}
		}
		System.out.println("the sum is"+ sum);
		System.out.println("the avg of odd index is "+sum/count);
	}
}
