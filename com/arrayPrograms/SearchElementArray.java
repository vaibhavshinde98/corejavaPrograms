package com.arrayPrograms;

public class SearchElementArray {

	public static void main(String[] args) {
		int [] n= {10,20,30,40};
		int findno=40;
		 boolean found= false;
		for (int x:n) {
			if(x==findno) {
			found= true;
			break;
			}
			
		}
		if(found) {
			System.out.println(findno +"is found");
		}
		else {
			System.out.println(findno + "is found");
		}
		
	}

}
