package array_pgms;

public class RevArray {
	public static void main(String[] args) {
		int [] arr= {10,20,30};
		int [] revarr= new int [arr.length];
		for (int i = 0; i < revarr.length; i++) {
			revarr[i]=arr[arr.length-1-i];
		}
		for (int i = 0; i < revarr.length; i++) {
			System.out.print(revarr[i]+" ");
		}
	}
	
}
