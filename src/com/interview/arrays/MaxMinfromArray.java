package com.interview.arrays;

import java.util.Arrays;

/**
 * Java program to find largest and smallest number from an array in Java. * You
 * cannot use any library method both from Java and third-party library. * 
 * Hint
 * 		1. assign largest value to Intger.MIN_VALUE 
 * 		2. assign smallest value to Intger.MAX_VALUE
 *      3. loop over the array and compare item with largest and smallest and reassing it based on condition
 */

public class MaxMinfromArray {

	public static void main(String[] args) {
		largestAndSmallest(new int[] { -20, 34, 21, -87, 92, Integer.MAX_VALUE });
		largestAndSmallest(new int[] { 10, Integer.MIN_VALUE, -2 });
		largestAndSmallest(new int[] { Integer.MAX_VALUE, 40, Integer.MAX_VALUE });
		largestAndSmallest(new int[] { 1, -1, 0 });

	}

	public static void largestAndSmallest(int arr[]) {

		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;

		for (int a : arr) {
			if (a > largest) {
				largest = a;
			} else if (a < smallest) {
				smallest = a;
			}
		}

		System.out.println("Given integer array : " + Arrays.toString(arr));
		System.out.println("Largest number in array is : " + largest);
		System.out.println("Smallest number in array is : " + smallest);

	}
}
