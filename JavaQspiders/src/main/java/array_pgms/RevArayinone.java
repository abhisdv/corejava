package array_pgms;

public class RevArayinone {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 50 };
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
