package Collection.java;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add("automtic habits");
		a.add("unposted letter");
		a.add("pyschology of money");
		a.add("alchemist");
		a.add("do epic shit");
		
		System.out.println(a);
		
		ArrayList a2= new ArrayList();
		a2.add("sql");
		a2.add("core java");
		a2.add("selenium");
		a2.add("js");
		
		System.out.println(a2);
		
		a.addAll(a2);
		
		System.out.println(a);

	}

}
