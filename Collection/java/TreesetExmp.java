package Collection.java;

import java.util.TreeSet;

public class TreesetExmp {

	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		ts.add(1);
		ts.add(4);
		ts.add(0);
		ts.add(10);
		ts.add(30);
		
		System.out.println(ts);    // insertion order is maintained
	}

}
