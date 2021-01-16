package com.interview.arrays;

/**
 * Does your method work with negative numbers? If arrayOfInts is [-10, -10, 1,
 * 3, 2][−10,−10,1,3,2] we should return 300 300 (which we get by taking -10 *
 * -10 * 3−10∗−10∗3).
 * 
 * We can do this in O(n)O(n) time and O(1)O(1) space.
 * 
 * @author hp
 *
 */
public class ProductOf3Numbers {

	public static void main(String[] args) {
		
		int arr [] = {-10,-10,1,3,2};
		System.out.println(highestProductOf3(arr));
	}
	
	
	public static int highestProductOf3(int[] arrayOfInts) {

		if (arrayOfInts.length < 3) {
			throw new IllegalArgumentException("Less than 3 items!");
		}

		// we're going to start at the 3rd item (at index 2)
		// so pre-populate highests and lowests based on the first 2 items.
		// we could also start these as null and check below if they're set
		// but this is arguably cleaner
		int highest = Math.max(arrayOfInts[0], arrayOfInts[1]);
		int lowest = Math.min(arrayOfInts[0], arrayOfInts[1]);

		int highestProductOf2 = arrayOfInts[0] * arrayOfInts[1];
		int lowestProductOf2 = arrayOfInts[0] * arrayOfInts[1];

		// except this one--we pre-populate it for the first *3* items.
		// this means in our first pass it'll check against itself, which is fine.
		int highestProductOf3 = arrayOfInts[0] * arrayOfInts[1] * arrayOfInts[2];

		// walk through items, starting at index 2
		for (int i = 2; i < arrayOfInts.length; i++) {
			int current = arrayOfInts[i];

			
			highestProductOf3 = Math.max(highestProductOf3, current * highestProductOf2);

			// do we have a new highest product of two?
			highestProductOf2 = Math.max(highestProductOf2, current * highest);

			// do we have a new lowest product of two?
			lowestProductOf2 = Math.min(lowestProductOf2,  current * lowest);
			

			// do we have a new highest?
			highest = Math.max(highest, current);

			// do we have a new lowest?
			lowest = Math.min(lowest, current);
		}

		return highestProductOf3;
	}
}
