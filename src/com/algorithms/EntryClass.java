package com.algorithms;

public class EntryClass {
	/**
	 * Choose which algorithm to execute
	 * 
	 * @param type
	 * Type of algorithm to execute
	 */
	public void chooseAlgorithmToExecute(int type) {
		switch (type) {
			case 1: // Binary search
				int[] a = new int[] { 1, 3, 5, 12, 45, 78, 79, 92 };
				int x = 12; // element to find
	
				// Recursive
				BinarySearch.binarySearch(a, x, true);
	
				// Iterative
				BinarySearch.binarySearch(a, x, false);
				break;
				
			case 2: // Sequential search				
				int[] arr = new int[] { 2, 6, 9, 12, 23, 32, 65, 76 };
				int elem = 1;
				int y = SequentialSearch.sequentialSearch(arr, elem);
				if(y == -1) {
					System.out.println("Element not found");
				} else {
					System.out.println("Element found at index: " + y + ", a["+y+"]=" + arr[y]);
				}
				break;
				
			case 3: // Jump search
				int[] arr2 = new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
				int x2 = 34;
				JumpSearch.search(arr2, x2);
				break;
				
			case 4: // Interpolation search
				int arr3[] = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
				int x3 = 20;
				InterpolationSearch.search(arr3, x3);
				break;
				
			default:
				System.out.println("Invalid entry! Please try again");
		}
	}

	public static void main(String[] args) {
		// Create object of the class
		EntryClass m = new EntryClass();

		/**
		 * Binary search - 1
		 * Sequential search - 2
		 * Jump search - 3
		 * Interpolation search - 4
		 */
		//m.chooseAlgorithmToExecute(1);		
		//m.chooseAlgorithmToExecute(2);
		//m.chooseAlgorithmToExecute(3);
		m.chooseAlgorithmToExecute(4);

	}

}
