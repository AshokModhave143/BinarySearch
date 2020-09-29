package com.algorithms;

public class SequentialSearch {

	public static int sequentialSearch(int[] a, int x) {
		System.out.println("************ Sequential Search ***************");
		for(int i=0; i<a.length; i++) {
			if(a[i] == x) {
				return i;
			}
		}
		
		return -1;
	}
}
