package com.deepanshu.core.javaPractice;

import java.util.HashMap;

public class LeetCodePractice {

	public static void main(String[] args) {

		int[] nums = { 2, 2, 11,7 };
		int target = 9;
		int[] resukt = twoSum(nums, target);
		System.out.println(resukt[0]+ " "+resukt[1]);
		
	}

	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> check= new HashMap<>();
		

		for(int i = 0; i<nums.length; i++) {
			int comp = target-nums[i];
			
			if(check.containsKey(comp)) {
				return new int[] {check.get(comp),i};
			}
			
			check.put(nums[i], i);
		}
		
		
		return nums;

	}
}
