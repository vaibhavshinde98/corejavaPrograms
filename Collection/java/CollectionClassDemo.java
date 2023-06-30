package Collection.java;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionClassDemo {

	public static void main(String[] args) {
		ArrayList a= new ArrayList<>();
		a.add(9);
		a.add(2);
		a.add(0);
		a.add(4);
		a.add(5);
		
		Collections.sort(a);	// sorting in asceding order
		System.out.println(a);
		
		Collections.shuffle(a);   //arrange in random order
		System.out.println(a);
		
		Collections.reverse(a); //reverse in list
		System.out.println(a);
		
		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);  //arranged in descending order
		System.out.println(a);
	}

}
