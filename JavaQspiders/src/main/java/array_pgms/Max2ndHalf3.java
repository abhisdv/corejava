package array_pgms;

public class Max2ndHalf3 {
	public static void main(String[] args) {
		int [] a= {3,6,4,81,7,45};
		int max=a[a.length-1];
		for (int i = a.length/2; i < a.length; i++) {
		
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("the maximum value in 2nd half is "+max);
	}

}
