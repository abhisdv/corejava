package array_pgms;

import java.util.ArrayList;
import java.util.Arrays;

public class MerglistArray2 {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30 };
		int b[] = { 40, 50, 60 };
		ArrayList l1 = new ArrayList();
		for (Object obj : a) {
			l1.add(obj);
		}

		for (Object obj2 : b) {
			l1.add(obj2);
		}

		Object arr[] = l1.toArray();
		System.out.println(Arrays.toString(arr));

	}
}
