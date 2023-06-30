package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		try {
			
		
		System.out.println("Enter size for array");
		int size= sc.nextInt();
		int arr[]= new int[size];
		System.out.println("array created successfully....");
		
		System.out.println("enter element to an array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("valuer storing is successfull...");
		System.out.println("enter first index: ");
		
		int i1=sc.nextInt();
		 
		System.out.println("enter second index: ");
		
		int i2=sc.nextInt();
		
		int ans= arr[i1]/arr[i2];
		
		System.out.println(ans);
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("please enter index which is more than 0 and less than 4");
		}
		catch(ArithmeticException ar) {
			System.out.println("dont divide by zero");
		}
		catch(InputMismatchException i) {
			System.out.println("please enter valid inpute");
		}
		catch(NullPointerException ne) {
			System.out.println("create array..!");
		}
		System.out.println("thank you..!");
		
		

	}

}
