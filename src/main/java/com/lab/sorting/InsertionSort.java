package com.lab.sorting;

public class InsertionSort {

	public static void main(String[] args) {

		int[] nums = { 6, 3, -12, 34, -56, 22, 4, 1 };

		for (int i = 1; i < nums.length; i++) {

			int j = i;

			while (j > 0 && nums[j - 1] > nums[j]) {
				swap(nums, j - 1, j);
				j--;
			}
		}

		showArray(nums);
	}

	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void showArray(int[] nums) {

		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
	}

}
