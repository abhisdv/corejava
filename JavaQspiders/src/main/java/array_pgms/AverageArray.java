package array_pgms;

class Demo {
	public void heelo() {
		System.out.println("this is another class");
	}
}

public class AverageArray {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 8, 4 };
		int sum = 0;
		new Demo().heelo();
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

		}
		System.out.println("the average is " + sum / arr.length);
	}

}
