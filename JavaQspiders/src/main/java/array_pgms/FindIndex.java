package array_pgms;

public class FindIndex {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 2,8, 4 };
		int value = 8;
		boolean temp = false;

		for (int i = 0; i < arr.length; i++) {
			if (value == arr[i]) {
				System.out.println("the index is " + i);
				temp = true;
			}
		}

		if (temp == false)

		{
			System.out.println("the element is not present");
		}

	}
}
