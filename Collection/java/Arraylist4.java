package Collection.java;

import java.util.ArrayList;

public class Arraylist4 {

	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList();
		a.add("pune");
		a.add("mumbai");
		a.add("kolhapur");
		
		String ans=" ";
		
		for(String w:a) {
			ans= ans+w;
			System.out.println(ans);
		}

	}

}
