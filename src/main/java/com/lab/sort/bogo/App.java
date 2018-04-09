package com.lab.sort.bogo;

public class App {
	
	public static void main(String[] args) {
		
		int[] nums =
				{-1,5,2,-7,12,-34,-10,4};
		
		int loopConuter = 0;
		
		while(!isSorted(nums)){
			
			++loopConuter;
			shuffle(nums);
		}
		
		System.out.println(loopConuter);
		showArray(nums);
		
	}

	public static void shuffle(int[] nums) {

		for (int i = nums.length - 1; i >= 0; i--) {
			int j = (int) (Math.random() * i);
			swap(nums, i, j);
		}
	}

	public static void swap(int[] nums, int i, int j) {

		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static boolean isSorted(int[] nums) {

		for (int i = 0; i < nums.length-1; i++) {

			if (nums[i] > nums[i + 1])
				return false;
		}

		return true;
	}

	public static void showArray(int[] nums) {

		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
	}

}
