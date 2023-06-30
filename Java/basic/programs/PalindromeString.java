package Java.basic.programs;

import java.util.Iterator;

public class PalindromeString {

	public static void main(String[] args) {
		String str="mvm";
	String rev="";	
	int lenghtstr= str.length();
		
		for(int i=(lenghtstr-1);i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(str==rev) {
			System.out.println("this is palindrome");
		}
		else {
			System.out.println("this is not palindrome");
		}

	
		
	}

}
