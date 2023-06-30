package Stringclass;

public class ConvertingStingtoPrimitive {

	public static void main(String[] args) {
		String s="12";
		System.out.println(s+10);
		
		int a=Integer.parseInt(s);
		
		System.out.println(a+20);
		
		String s2="false";
		boolean b= Boolean.parseBoolean(s2);
		System.out.println(b);
	}

}
