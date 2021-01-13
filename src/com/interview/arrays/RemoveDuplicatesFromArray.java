package com.interview.arrays;

import java.util.Arrays;

/**
 * how-to-remove-duplicates-from-array-java-without-collection-API
 * 
 * @author basavaraj
 *  * Hint
 * 		1. sort the array  
 * 		2. get first element to varible prev and loop the array from index 1
 *      3. start compare prev element with index 1 if not match then add it to new array 
 *      4. reassign the prev to current array element
 *
 */
public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		int[][] test = new int[][] { { 1, 1, 2, 2, 3, 4, 5 }, { 1, 1, 1, 1, 1, 1, 1 }, { 1, 2, 3, 4, 5, 6, 7 },
				{ 1, 2, 1, 1, 1, 1, 1 }, };

		for (int[] input : test) {

			removedublicate(input);
		}

	}

	public static void removedublicate(int[] arr) {
		System.out.println("Array with Duplicates       : " + Arrays.toString(arr));

		Arrays.sort(arr);

		int[] result = new int[arr.length];

		int prev = arr[0];

		result[0] = prev;

		for (int i = 1; i < arr.length; i++) {

			int ch = arr[i];

			if (prev != ch) {
				result[i] = ch;
			}
			prev = ch;

		}
		System.out.println("After removing duplicates   : " + Arrays.toString(result));

	}

}
