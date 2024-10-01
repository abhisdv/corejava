package array_pgms;

public class ReadOddIndex {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 8, 4, 9 };

		for (int i = 0; i < arr.length; i++) {
			if(i%2==1) {
				System.out.println(arr[i]+" ");
			}
			
		}
	}
}
