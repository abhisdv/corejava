package string_pgms;

public class DuplicateCount {
	public static void main(String[] args) {
		String s = "I am java java but not Pyton but it is good";
		String[] arr = s.split(" ");
		System.out.println(arr.length);
		int p = 0;
		String[] arn = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int con = 0;
			boolean flag = true;

			// check if the element is present in the new array or not if yes flag is true
			for (int m = 0; m < arn.length; m++) {
				if (arr[i].equals(arn[m])) {

					flag = false;									

				}
				//System.out.println(flag + " " + arr[i]);
			}
			////////////////////////////

			if (flag == true) {
				arn[p] = arr[i];
				// System.out.println(arn[p]+"the value for p is"+p+" ");
				for (int j = 0; j < arr.length; j++) {
					if (arr[i].equals(arr[j])) {
						con++;
					}

				}

				System.out.println(arr[i] + " " + con);

			}
			p++;
		}
		for (String string : arn) {
			System.out.print(string + "  ");
		}

	}
}
