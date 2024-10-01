package array_pgms;

public class MergeArray {
	public static void main(String[] args) {
		int[] arr1= {4,7,3,4,6};
		int [] arr2= {5,7,9,2};
		int [] anew=new int [arr1.length+arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			anew[i]=arr1[i];			
		}
		int index=arr1.length;
		for (int i = 0; i < arr2.length; i++) {
			 anew[index]=arr2[i];
			 index++;
			
		}
		for (int i : anew) {
			System.out.print(i+" ");
		}
	}
	
	
}
