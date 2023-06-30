package Wrapper.boxing.unboxing;

public class Unboxing {

	public static void main(String[] args) {
		
		Character c1= new Character('a');   //boxing
		System.out.println(c1.toString());
		
		char c=c1.charValue();     //unboxing
		
		System.out.println(c);
		
		Double d1= new Double(3.34);  //boxing
		double d=d1.doubleValue();    //unboxing
		
		System.out.println(d);
	}

}
