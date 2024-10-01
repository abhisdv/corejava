package array_pgms;

public class DeleteEle {
	public static void main(String[] args) {
		int [] a= {2,5,1,7,5};
		int a2[] =new int [a.length-1];
		int dindex=2;
		for (int i = 0; i < a2.length; i++) {
			if(i<2) {
				a2[i]=a[i];
			}else {
				a2[i]=a[i+1];
			}
			
		}
		for (int i : a2) {
			System.out.println(i);
		}
	}
}
