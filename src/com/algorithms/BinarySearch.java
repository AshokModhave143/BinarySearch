package com.algorithms;

import java.util.Arrays;

public class BinarySearch {
	public static int binarySearchIterative(int[] a, int x, int left, int right) {
		while (left <= right) {
			int mid = left + ((right - left)/2);
			if(a[mid] == x) {
				return mid;
			} else if(x < a[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}
	public static int binarySearchRecursive(int[] a, int x, int left, int right) {
		if(left > right) {
			return -1;
		}
		int mid = left + ((right - left) /2);  // to avoid overflow
		
		if(a[mid] == x) {
			return mid;
		} else if(x < a[mid]) {
			return binarySearchRecursive(a, x, left, mid - 1);
		} else {
			return binarySearchRecursive(a, x, mid + 1, right);
		}
	}
	
	public static void binarySearch(int[] a, int x, boolean isRecursive) {
		System.out.println("************** Binary Search ***************");
		System.out.println("Element list: " + Arrays.toString(a));	
		System.out.println("Element to find (" + ((isRecursive == true) ? "recursively" : "iterative") + "): " + x + " ");
		
		int y = isRecursive ? 
				binarySearchRecursive(a, x, 0, a.length - 1) // recursive
				: binarySearchIterative(a, x, 0, a.length - 1); // non-recursive
				
		if(y == -1) 
			System.out.println("Element not found");
		else 
			System.out.println("Found element at index: " + y + " | a["+ y +"]=" + a[y]);
	}

}
