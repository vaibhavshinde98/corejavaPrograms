package Wrapper.boxing.unboxing;

public class DataConversion {

	public static void main(String[] args) {
//		string to int
//		String str="welcome"; // not possible
		String s1= "10";
		String s2="28";
		
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		
		// string to double
		
		String a1="29.30";
		String a2="23.22";
		 double d1 = Double.parseDouble(s1);
		 double d2= Double.parseDouble(s2);
		 System.out.println(d1+d2);
		 
		 
		 // string to boolean
		 
		 String b1= "true";
		 boolean b= Boolean.parseBoolean(b1);
		 System.out.println(b);
		 
		 
//		 ---------convert to string format--------------
		 int x=100;
		 
		 System.out.println(String.valueOf(x));
		 
	}

}
