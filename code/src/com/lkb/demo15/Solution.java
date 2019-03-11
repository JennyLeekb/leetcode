package com.lkb.demo15;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,5};
		int target = 13;
		int[] result = new Solution().twoSum(nums, target);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i] + " -> ");
		}
		
	}
	
	
	/**
	 * LeetCode（1）两数之和
	 * @param nums
	 * @param target
	 * @return
	 */
//	 public int[] twoSum(int[] nums, int target) {
//		 int[] result = new int[2];
//			 
//		 for(int i=0;i<nums.length;i++){
//			 for(int j =i+1;j<nums.length;j++){
//				 if((nums[i]+nums[j]) == target){
//					 result[0] = i;
//					 result[1] = j;
//					 return result;
//				 }
//			 }			
//		 }
//	             
//		 return result;
//	 }
	 
	 public int[] twoSum(int[] nums, int target) {
		 int[] result = new int[2];
		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		 for(int i=0;i<nums.length;i++){
			 if(map.get(nums[i]) != null){
				 result[0] = i;
				 result[1] = map.get(nums[i]);
				 return result;
			 }else{
				 map.put(target-nums[i], i);
			 }
		 }       
		 
		 return null;
	 }

}
