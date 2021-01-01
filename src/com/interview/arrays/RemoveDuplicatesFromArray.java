package com.interview.arrays;

import java.util.Arrays;

/**
 * how-to-remove-duplicates-from-array-java-without-collection-API
 * 
 * @author hp
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
