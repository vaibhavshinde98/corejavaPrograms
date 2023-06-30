package Stringclass;

public class Stringconverision {

	public static void main(String[] args) {
		char [] c= {'a','b','c','d','f'};
		
		String s=new String(c);
		System.out.println(s);
		
		s=s+ "vs";
		System.out.println(s);
	}

}
