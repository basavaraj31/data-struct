package com.interview.arrays;

/**
 * 
 * @author basavaraj
 * 
 *         You have an array of integers, and for each index you want to find
 *         the product of every integer except the integer at that index.
 * 
 *         Write a method getProductsOfAllIntsExceptAtIndex() that takes an
 *         array of integers and returns an array of the products.
 * 
 *         For example, given:
 * 
 *         [1, 7, 3, 4]
 * 
 *         your method would return:
 * 
 *         [84, 12, 28, 21]
 * 
 *         by calculating:
 * 
 *         [7 * 3 * 4, 1 * 3 * 4, 1 * 7 * 4, 1 * 7 * 3]
 * 
 *         Here's the catch: You can't use division in your solution!
 *
 */
public class ProductOfAllOtherNumber {

	public static void main(String[] args) {
		int[] array = new int[] { 3, 1, 2, 5, 6, 4 };

		System.out.println("Before: ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("");
		int maxProfit[] = getProductsOfAllIntsExceptAtIndex(array);

		System.out.println("After: ");
		for (int i : maxProfit) {
			System.out.print(i + " ");
		}
	}

	public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {

		if (intArray.length < 2) {
			throw new IllegalArgumentException(
					"Getting the product of numbers at other indices requires at least 2 numbers");
		}

		// we make an array with the length of the input array to
		// hold our products
		int[] productsOfAllIntsExceptAtIndex = new int[intArray.length];

		// for each integer, we find the product of all the integers
		// before it, storing the total product so far each time
		int productSoFar = 1;
		for (int i = 0; i < intArray.length; i++) {
			productsOfAllIntsExceptAtIndex[i] = productSoFar;
			productSoFar *= intArray[i];
		}


		// for each integer, we find the product of all the integers
		// after it. since each index in products already has the
		// product of all the integers before it, now we're storing
		// the total product of all other integers
		productSoFar = 1;
		for (int i = intArray.length - 1; i >= 0; i--) {
			productsOfAllIntsExceptAtIndex[i] *= productSoFar;
			productSoFar *= intArray[i];
		}
		
		return productsOfAllIntsExceptAtIndex;
	}
}
