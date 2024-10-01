package array_pgms;

public class Avg2ndHalf3 {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 8, 4,9 };
		int sum = 0;
		int count = 0;
		if (arr.length % 2 != 0) {
			System.out.println("not eligible for the logic");
		} else {
			for (int i = arr.length/2; i < arr.length ; i++) {

				sum += arr[i];
				count++;

			}
			System.out.println("the average is " + sum / count);
		}
	}
}
