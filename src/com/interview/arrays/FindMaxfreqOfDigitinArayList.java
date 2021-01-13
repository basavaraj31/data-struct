package com.interview.arrays;

/**
 * Find the array element having maximum frequency of the digit K Input: arr[] =
 * {3, 77, 343, 456}, K = 3 Output: 343 Explanation: Frequency of 3 in array
 * elements: 1, 0, 2, 0 343 has maximum frequency i.e. 2.
 * 
 * @author hp
 *
 */
public class FindMaxfreqOfDigitinArayList {

	public static int countFreq(int N, int K) {

		// Stores count of occurrence
		// of digit K in N
		int count = 0;

		// Iterate over digits of N
		while (N > 0) {

			// If current digit is k
			if (N % 10 == K) {

				// Update count
				count++;
			}

			// Update N
			N = N / 10;
		}
		return count;
	}

	// Utility function to find an array element
	// having maximum frequency of digit k
	public static int findElementUtil(int arr[], int N, int K) {

		// Stores frequency of
		// digit K in arr[i]
		int c;

		// Stores maximum frequency of
		// digit K in the array
		int max;

		// Stores an array element having
		// maximum frequency of digit k
		int ele = 0;

		// Initialize max
		max = 0;

		// Traverse the array
		for (int i = 0; i < N; i++) {

			// Count the frequency of
			// digit k in arr[i]
			c = countFreq(arr[i], K);

			// Update max with maximum
			// frequency found so far
			if (c > max) {
				max = c;

				// Update ele
				ele = arr[i];
			}
		}

		// If there is no array element
		// having digit k in it
		if (max == 0)
			return -1;
		else
			return ele;
	}

	// Function to find an array element
	// having maximum frequency of digit k
	public static void findElement(int arr[], int N, int K) {

		// Stores an array element having
		// maximum frequency of digit k
		int ele = findElementUtil(arr, N, K);

		// If there is no element found
		// having digit k in it
		if (ele == -1)
			System.out.println("-1");

		else

			// Print the element having max
			// frequency of digit k
			System.out.println(ele);
	}

	// Driver Code
	public static void main(String[] args) {

		// The digit whose max
		// occurrence has to be found
		int K = 3;

		// Given array
		int arr[] = { 3, 77, 343, 456 };

		// Size of array
		int N = arr.length;

		// Function Call
		findElement(arr, K, N);
		
		int K1 = 1;
		
		int arr1[] =  {1, 1111, 111, 11};

		// Size of array
		int N1 = arr1.length;

		// Function Call
		findElement(arr1, K1, N1);

	}
}
