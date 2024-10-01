package Collections; 

import java.util.HashMap;

public class HashMap_pgm {
	public static void main(String[] args) {
		HashMap<Integer,Integer> h=new HashMap();
		h.put(5,1);
		h.put(5, 2);
		h.put(3, 5);
		h.put(null, null);
		System.out.println(h);
		}
}
