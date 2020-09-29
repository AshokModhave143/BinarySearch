package com.algorithms;

public class JumpSearch {
	public static int jumpSearch(int[] a, int x) {		
		int n = a.length;
		int step = (int)Math.floor(Math.sqrt(n));  // jump size
		
		int prev = 0;
		
		while(a[Math.min(step, n)-1] < x) {
			prev = step;
			step = step + (int)Math.floor(Math.sqrt(n));
			
			if(prev >= n) {
				return -1;
			}
		}
		
		while(a[prev] < x) {
			prev++;
			
			if(prev == (int)Math.min(step, n)) {
				return -1;
			}
		}
		
		if(a[prev] == x) {
			return prev;
		}
		
		return -1;
	}
	
	public static void search(int[] a, int x) {
		System.out.println("*********** Jump Search *******************");
		int y = jumpSearch(a, x);
		
		if(y == -1) 
			System.out.println("Element not found");
		else 
			System.out.println("element found at index: " + y + ", a["+y+"]=" + a[y]);
	}
}
