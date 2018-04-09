package com.lab.sorting;

import java.util.concurrent.CountDownLatch;

public class SleepSort {

	public static void main(String[] args) {

		int[] nums = { 5, 2, 7, 1, 20, 9, 3 };
		sleepSort(nums);
	}

	public static void sleepSort(int[] nums) {

		CountDownLatch latch = new CountDownLatch(nums.length);

		for (int num : nums) {

			new Thread() {

				public void run() {
					latch.countDown();
					try {

						latch.await();
						Thread.sleep(num * 100);
						System.out.print(num + " ");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}.start();
		}
	}

}
