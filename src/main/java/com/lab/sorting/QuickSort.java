package com.lab.sorting;

public class QuickSort {

	int[] nums;

	public QuickSort(int[] nums) {
		this.nums = nums;
	}

	public void swap(int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public void showArray() {

		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");

	}

	public void quickSort(int low, int high) {

		if (low >= high)
			return;
		int pivot = partition(low, high);

		quickSort(low, pivot - 1);
		quickSort(pivot + 1, high);
	}

	public int partition(int low, int high) {

		int pivotIndex = (low + high) / 2;

		swap(pivotIndex, high);

		
			int i = low;

			for (int j = low; j < high; j++) {
				if (nums[j] <= nums[high]) {
					swap(i, j);
					i++;
				}
			}

			swap(i, high);
		

		return i;
	}
	
	public static void main(String[] args) {
		
		int nums[]={4,1,10,-2,1,67,0};
		
		QuickSort sort = new QuickSort(nums);
		sort.quickSort(0, nums.length-1);
		
		sort.showArray();
	}

}
