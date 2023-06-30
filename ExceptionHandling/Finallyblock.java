package ExceptionHandling;

import java.util.Scanner;

public class Finallyblock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1");
		int no1= sc.nextInt();
		
		System.out.println("enter no2");
		int no2= sc.nextInt();
		
		try {
			int ans=no1/no2;
			System.out.println(ans);
		}
		/*
		catch(Exception e) {
			System.out.println("dont divide by zero");
		}    */
		finally {
			System.out.println("thankl you");
		}
	}

}
