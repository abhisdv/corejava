package array_pgms;

public class Min2nd {
	public static void main(String[] args) {
		int [] a= {3,6,1,7,};
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		int min2=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=min ) {
				if(a[i]<min2) {
					min2=a[i];
				}
			}
		}
		
		System.out.println(min2); 
	
	}

}
