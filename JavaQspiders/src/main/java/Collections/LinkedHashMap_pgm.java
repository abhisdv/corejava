package Collections;

import java.util.LinkedHashMap;

public class LinkedHashMap_pgm {
	public static void main(String[] args) {
		LinkedHashMap<Integer,Integer> h=new LinkedHashMap();
		h.put(5,1);
		h.put(5, 2);
		h.put(3, 5);
		h.put(null, null);
		System.out.println(h);
		}
}
