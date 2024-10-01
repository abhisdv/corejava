package string_pgms;

public class CharOccurence {
	public static void main(String[] args) {
		String s = "javamava";
		char[] arr = s.toCharArray();
		int p=0;
		char[] arn = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			int count = 0;
			for (int m = 0; m < arr.length; m++) {
				if (arn[m] == arr[i]) {
					
					flag = false;
					break;
				}

			}
			if (flag == true) {
				arn[p++]=arr[i];
				for (int j = 0; j < arn.length; j++) {
					if(arr[i]==arr[j]) {
						count++;
					}
				}
				System.out.println(arr[i] +" "+ count);
			}
		}
	}
}
