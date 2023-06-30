package ExceptionHandling;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no1: ");
		int n1=sc.nextInt();
		
		System.out.println("Enter no1");
		int n2= sc.nextInt();

		try {
			int d= n1/n2;
		}
		catch(Exception e) {
		System.out.println("exception handled");
		
	}
	
	}

}
