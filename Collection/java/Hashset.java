package Collection.java;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet <String> h= new HashSet();
		h.add("pune");
		h.add("indor");
		h.add("mumbai");
		h.add("delhi");
		h.add("pune");
		
		System.out.println(h);
		h.remove(3);
		System.out.println(h);
	}

}
