package array_pgms;

public class ReadEvenIndexReverse {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 8, 4, 9 };

		for (int i = arr.length-1; i >=0; i--) {
			if(i%2==0) {
				System.out.println(arr[i]+" ");
			}
			
		}
	}
}
