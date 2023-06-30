package Collection.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class MixedDemo {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add(2);
		a.add(4);
		a.add(9);
		a.add(8);
		a.add(32);
		a.add(2);
		a.add(82);
		
		System.out.println(a);
		 
		HashSet h= new HashSet<>(a);
		System.out.println(h);
		
		TreeSet ts= new TreeSet<>(a);
		System.out.println(ts);
		
		ArrayList sorted= new ArrayList<>(ts);
		System.out.println(sorted);

	}

}
