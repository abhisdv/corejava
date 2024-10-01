package array_pgms;

public class NthMin {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 7, 7, 7 ,0};
		int[] arr2 = new int[arr.length];
		int index = 0;
		

		for (int i = 0; i < arr.length; i++) {
			boolean temp = true;
			int count = 0;
			for (int j2 = 0; j2 < arr2.length; j2++) {
				if (arr[i] == arr2[j2]) {
					temp = false;
					//break; not required
				}
			}
			for (int j = 0; j < arr.length; j++) {

				if (temp == true && arr[i] == arr[j]) {
					count++;

				}
			}
			if(temp==true) {
			System.out.println(arr[i] + " " + count);
			arr2[index++] = arr[i];
		
			}

		}
	}
}
