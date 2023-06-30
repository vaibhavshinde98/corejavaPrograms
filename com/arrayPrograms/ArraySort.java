package com.arrayPrograms;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int []n= {90,30,23,11,78,25};
		Arrays.sort(n);
		
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}

}
