package com.algorithms;

public class InterpolationSearch {
	
	/**
	 * formula to find position
	 * 
	 * pos = lo + [(x - a[lo])*(hi-lo)/ (a[hi]-a[lo])]
	 * 
	 * a[] => array where element need to search
	 * x  => element to searched
	 * lo  => lower index a[]
	 * hi  => end index of a[]
	 * 
	 * @param a
	 * @param x
	 * @return
	 */
	public static int interpolationSearchIterative(int[] a, int x) {
		int lo = 0, hi = a.length - 1;
		
		while( lo <= hi && x >= a[lo] && x <= a[hi]) {
			
			// Reached end of array
			if(lo == hi) {
				if(a[lo] == x) return lo;
				return -1;
			}
			
			// Important: find interpolation position
			int pos = lo + ((hi - lo) / (a[hi] - a[lo])) * (x - a[lo]);
			
			// Target found at "pos"
			if(a[pos] == x)  return pos;
			
			// If x is larger than "pos" value, x is in higher part
			if(x > a[pos]) {
				lo = pos + 1;
			} else { // If x is less than "pos" value, x is in lower part
				hi = pos - 1;
			}
		}
		
		return -1;
	}
	
	public static int interpolationSearchRecusrsive(int[] a, int x, int lo, int hi) {
		if(hi == lo) {
			if(a[lo] == x) return lo;
			return -1;
		}
		while(lo <= hi && x >= a[lo] && x <= a[hi]) {
			int pos = lo + (((hi - lo) / (a[hi]-a[lo]))*(x-a[lo]));
			
			if(a[pos] == x) return pos;
			
			if(x > a[pos]) return interpolationSearchRecusrsive(a, x, pos + 1, hi);
			else return interpolationSearchRecusrsive(a, x, lo, pos-1);
		}
		return -1;
	}
	
	/**
	 * Search using interpolation algorithm
	 * @param a - integer array
	 * @param x - element to search
	 */
	public static void search(int[] a, int x) {
		System.out.println("************* Interpolation Search ******************");
		
		// int y = interpolationSearchIterative(a, x);
		int y = interpolationSearchRecusrsive(a, x, 0, a.length - 1);
		
		if(y == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index: " + y + ", a["+y+"]="+a[y]);
		}
		
	}

}
