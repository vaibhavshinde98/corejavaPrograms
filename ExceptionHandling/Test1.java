package ExceptionHandling;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no1");
		int no1= sc.nextInt();
		
		System.out.println("enter no2");
		int no2= sc.nextInt();
		
		try {
			int ans= no1/no2;
			System.out.println("answer is:  "+ans);	
		}
		catch(ArithmeticException a) {
			System.out.println("dont divide no by zero");
		}
		System.out.println("thank you");
	}

}
