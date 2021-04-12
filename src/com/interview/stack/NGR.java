package com.interview.stack;

import java.util.Stack;

/**
 * Nearest greater to right
 * 
 * @author hp i/p |1|3|2|4| o/p |3|4|4|-1|
 */
public class NGR {

	public static void main(String[] args) {
		int[] input = new int[] { 1, 3, 2, 4 };
		int[] output = ngl(input);
		
		for (int i : output) {
			System.out.print(i+ " ");
		}	
		System.out.println();
		int[] input2 = new int[] { 1, 3, 0,0,1,2,4 };
		int[] output2 = ngl(input2);
		
		for (int i : output2) {
			System.out.print(i+ " ");
		}
	}
	
	

	public static int[] ngl(int[] arr) {

		Stack<Integer> s = new Stack<Integer>();
		int[] outputArray = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {

			if (s.isEmpty()) {
				outputArray[i] = -1;
			} else if (!s.isEmpty() && s.peek() > arr[i]) {
				outputArray[i] = s.peek();
			} else if (!s.isEmpty() && s.peek() <= arr[i]) {

				while (!s.isEmpty() && s.peek() <= arr[i]) {
					s.pop();
				}

				if (s.isEmpty()) {
					outputArray[i] = -1;
				} else {
					outputArray[i] = s.peek();
				}
			}
			s.push(arr[i]);
		}

		return outputArray;
	}
}
