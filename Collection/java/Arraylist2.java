package Collection.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist2 {
// wjp to containt 5 fruits and remove 1 rotten fruit from arraylist
	public static void main(String[] args) {
		ArrayList a= new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("add the fruits to be sold");
		
		for(int i=0; i<5;i++) {
			a.add(sc.next());
		}
		
		System.out.println("fruits are added successfullly...");
		
		System.out.println("available fruits are:   "+a);
		System.out.println("enter rotten fruit name which will be remove from container: ");
		
		String rf=sc.next();
		
		if (a.contains(rf)) {
			a.remove(rf);
			System.out.println("rotted fruit are removed...");

		}
		else {
			System.out.println("rotted fruit is not found...");

		}
		System.out.println("now available fruits are:   "+ a);
	}
	


}
