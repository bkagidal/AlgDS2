package com.lab.sorting;

public class SelectionSort {

	public static void main(String[] args) {

		int[] nums = { 7, -2, 56, 34, -89, 3 };

		for (int i = 0; i < nums.length - 1; i++) {

			int index = i;

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[index])
					index = j;
			}

			if (index != i)
				swap(nums, i, index);
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
