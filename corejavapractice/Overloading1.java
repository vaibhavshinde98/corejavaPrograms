package corejavapractice;

public class Overloading1 {

	public static void main(String[] args) {
		test(20.20);
	}
	
	
	public static void test(int a) {
		System.out.println("this is integer  "+ a);
	}
	
	public static void test(double b) {
		System.out.println("this is double  "+ b);
	}

}
	