package com.lab.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] nums = { 5, -4, 67, 23, -34, 89, 12, -3 };

		showArray(nums);

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {

				if (nums[j] > nums[j + 1])
					swap(nums, j, j + 1);
			}
		}

		System.out.println();

		showArray(nums);
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;

	}

	private static void showArray(int[] nums) {

		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
	}
}
