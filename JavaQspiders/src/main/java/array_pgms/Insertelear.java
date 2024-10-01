package array_pgms;

import java.util.ArrayList;
import java.util.Arrays;

public class Insertelear {
	public static void main(String[] args) {
		int [] arr= {4,7,2,8};
		Object[] anew=new Object  [arr.length+1];
		ArrayList<Integer> al= new ArrayList<Integer>();
		for (int i : arr) {
			al.add(i);		
		}
		al.add(2, 111);
		anew= al.toArray();
		for (int i : al) {
			System.out.print(i+" ");
		}
		
	}
}
