package com.arrayPrograms;

public class FindEvenOdd {

	public static void main(String[] args) {
		int n[]= {11,12,13,14,15,16,17,18,19,20};
		for (int i = 0; i < n.length; i++) {
			if (i%2==0) {
				System.out.println(n[i]);
			}
		}
	}

}
