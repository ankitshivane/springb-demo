package com.example.demo;

public class Program3 {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0 };
		int maxConsecutiveZeros = findMaxConsucutiveZeros(nums);
		System.out.println(maxConsecutiveZeros);
	}

	public static int findMaxConsucutiveZeros(int[] nums) {
		int maxCount = 0;
		int currentCount = 0;
		for (int n : nums) {
			if (n == 0) {
				currentCount++;
				maxCount = Math.max(maxCount, currentCount);

			} else {
				currentCount = 0;
			}
		}
		return maxCount;
	}
}
