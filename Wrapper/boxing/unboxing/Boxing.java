package Wrapper.boxing.unboxing;

public class Boxing {

	public static void main(String[] args) {
		int a=5;
		
//		System.out.println(a.toString());    //complitetime error
		Integer c= new Integer(a);   //boxing
		
		System.out.println(c);
		System.out.println(c.toString());
	}

}
