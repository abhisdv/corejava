package array_pgms;

import java.util.HashSet;

public class Commonele {
	public static void main(String[] args) {
		int[] a1 = { 12, 54, 78, 35, 23 };
		int[] a2 = { 23, 78,21, 78, 45, 53 };
		System.out.println("kya ho rha h");
		HashSet h= new HashSet();
		for (int i = 0; i < a1.length ; i++) {
			for (int j = 0; j < a2.length; j++) {
				
				if(a1[i]==a2[j]) {					
					//System.out.print(a1[i]+" ");
					h.add(a1[i]);
				}
			}
		}
		System.out.println(h);
	}
}
