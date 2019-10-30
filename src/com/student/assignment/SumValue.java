package com.student.assignment;

import java.util.Random;

public class SumValue {

	static void generateRandomArray(int[] ar) {

		Random rd = new Random(); // creating Random object

		for (int i = 0; i < ar.length; i++) {
			ar[i] = rd.nextInt(); // storing random integers in an array
			System.out.println(ar[i]);
		}
	}

	static long sum(int[] arr) {
		long count = 0;

		for (long i : arr) {
			System.out.println(i);
			count += i;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = new int[40];
		generateRandomArray(arr);
		// generateArray(arr);
		long sum = sum(arr);
		System.out.println("Sum: " + sum);
	}
}