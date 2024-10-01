package Collections;

import java.util.TreeMap;

public class TreeMap_pgm {
	public static void main(String[] args) {
		TreeMap<Integer,Integer> h=new TreeMap();
		h.put(5,1);
		h.put(5, 2);
		h.put(3, 5);
		//h.put(null, null);   it will not accept null
		System.out.println(h);
		}
}
