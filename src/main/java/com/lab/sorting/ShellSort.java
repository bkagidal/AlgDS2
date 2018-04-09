package com.lab.sorting;

public class ShellSort {

	public static void main(String[] args) {

		int[] nums = { 5, 3, 8, 1, 9, -23, 13, 4, -56, 78, 12, 8, 5, 32 };

		for (int gap = nums.length / 2; gap > 0; gap = gap / 2) {

			for (int i = gap; i < nums.length; i++) {
				int j = i;
				while (j >= gap && nums[j - gap] > nums[j]) {
					swap(nums, j - gap, j);
					j = j - gap;
				}
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
