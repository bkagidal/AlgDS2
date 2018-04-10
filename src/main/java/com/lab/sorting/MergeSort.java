package com.lab.sorting;

public class MergeSort {

	int[] nums;
	int[] tempArray;

	public MergeSort(int[] nums) {
		this.nums = nums;
		this.tempArray = new int[nums.length];
	}

	public void printResult() {

		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
	}

	public void sort(int low, int high) {
		mergeSort(low, high);
	}

	public void mergeSort(int low, int high) {
		
		if(low>=high) return;

		int middle = (low + high) / 2;

		mergeSort(low, middle);
		mergeSort(middle + 1, high);

		merge(low, middle, high);
	}

	private void merge(int low, int middle, int high) {

		for (int i = low; i <= high; i++) {
			tempArray[i] = nums[i];
		}

		int i = low;
		int j = middle+1;
		int k = low;

		while ((i <= middle) && (j <= high)) {

			if (tempArray[i] < tempArray[j]) {
				nums[k] = tempArray[i];
				i++;
			} else {
				nums[k] = tempArray[j];
				j++;
			}

			k++;
		}

		while (i <= middle) {
			nums[k] = tempArray[i];
			k++;
			i++;
		}

		while (j <= high) {
			nums[k] = tempArray[j];
			k++;
			j++;
		}
	}

	public static void main(String[] args) {

		int nums[] = { 4, 1, 10, -2, 1, 67, 0 };

		MergeSort sort = new MergeSort(nums);

		sort.sort(0, nums.length - 1);

		sort.printResult();
	}

}
