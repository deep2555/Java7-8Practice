package com.deepanshu.core.javaPractice;

import java.util.HashMap;

public class LeetCodePractice {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2};
		int[] nums2 = { 3,4};
		int target = 9;
		//int[] resukt = twoSum(nums, target);
		//System.out.println(resukt[0]+ " "+resukt[1]);
		System.out.println(findMedianSortedArrays(nums1, nums2));
		
	}

	
	// median of the two merge array
	
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		 // first we have to merge the array
		 // second find the median in that array
		 double[] finalArray = mergeSort(nums1, nums2);
		 int length = finalArray.length;
		 
		 if(finalArray.length % 2 != 0) {
			 return finalArray[length/2];
		 }else {
			 int firstLength = length/2;
			 int secondLength = length/2 -1;
			 System.out.println(firstLength);
			 System.out.println(secondLength);
			 System.out.println(finalArray[firstLength]);
			 System.out.println(finalArray[secondLength]);
			 System.out.println();
			 return (finalArray[firstLength]+ finalArray[secondLength])/2;
		 }
	        
	    }
	 
	 public static double[] mergeSort(int[] nums1, int[] nums2) {
		 // first merge the array
		 int length = nums1.length + nums2.length;
		 double[] mergeArray = new double[length]; 
		 int i = 0,j = 0,k=0;
		 
		 while(i<nums1.length && j<nums2.length) {
			 if(nums1[i] < nums2[j]) {
				 mergeArray[k++] = nums1[i++];
			 }else {
				 mergeArray[k++] = nums2[j++];
			 }
		 }
		 while(i<nums1.length) {
			 mergeArray[k++]= nums1[i++];
			 
		 }
		 while(j<nums2.length) {
			 mergeArray[k++]= nums2[j++];
			 
		 }
		 return mergeArray;
	 }
	
	
	
	
	
	// sum of two array using the hashmap tech
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
