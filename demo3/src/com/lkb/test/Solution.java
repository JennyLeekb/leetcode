package com.lkb.test;

/*
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 * */
public class Solution {
	
	public static void main(String[] args) {
		Solution solution  = new Solution();
		int[] nums = {2,2,3,3,3};
		
		int result = solution.majorityElement(nums);
		
		System.out.println("众数为：" + result);
		
	}
	
	/**
	 * 求众数，用一个计数器count 遇到相同的+1，不同的-1
	 * @param nums
	 * @return
	 */
	public int majorityElement(int[] nums) {
		
		int result = nums[0];
		int count = 1;
		
		for(int i=1;i<nums.length;i++){
			if(nums[i] == result)
				count ++;
			else{
				count --;
				if(count == 0)
					result = nums[i+1];
			}
		}
		
		return result;
    }
}
