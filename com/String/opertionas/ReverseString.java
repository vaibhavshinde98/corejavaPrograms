package com.String.opertionas;

public class ReverseString {

	public static void main(String[] args) {
		String s="vaibhav";
		char ch;
		String rev="";
		
		System.out.println("vaibhav");
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			rev=ch+rev;
			
		}
		System.out.println(rev);

	}

}
