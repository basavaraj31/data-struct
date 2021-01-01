package com.interview.arrays;

import java.util.Arrays;

/**
 * Java Program to find all pairs on integer array whose sum is equal to k
 * 
 * @author basavaraj
 *    hint 1. sort the array 
 * 		   2. add left and right item if sum equal
 *         print and increse left index and decrese right index 3. if sum is
 *         less than K then increse left index 4. if sum is greater than K then
 *         decrese right index
 *
 */

public class ArrayProblemOne {

	public static void main(String args[]) {
		prettyPrint(new int[] { 12, 14, 17, 15, 19, 20, -11 }, 9);
		prettyPrint(new int[] { 2, 4, 7, 5, 9, 10, -1 }, 9);
	}

	public static void prettyPrint(int[] random, int k) {
		System.out.println("input int array : " + Arrays.toString(random));
		System.out.println("All pairs in an array of integers whose sum is equal to a given value " + k);
		printpairNumbers(random, k);
	}

	public static void printpairNumbers(int arr[], int k) {

		if (arr.length <= 2)
			return;

		Arrays.sort(arr);

		int left = 0, right = arr.length - 1;

		while (left < right) {

			int sum = arr[left] + arr[right];

			if (sum == k) {

				System.out.printf("(%d , %d) %n", arr[left], arr[right]);

				left = left + 1;
				right = right - 1;

			} else if (sum < k) {
				left = left + 1;
			} else if (sum > k) {
				right = right - 1;
			}

		}

	}

}
