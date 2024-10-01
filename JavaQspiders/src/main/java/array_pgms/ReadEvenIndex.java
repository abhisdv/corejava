package array_pgms;

public class ReadEvenIndex {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 8, 4, 9 };

		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				System.out.println(arr[i]+" ");
			}
			
		}
	}
}
