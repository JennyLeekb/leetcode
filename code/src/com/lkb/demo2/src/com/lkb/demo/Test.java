package com.lkb.demo;


/**/
public class Test {
	
	public static void main(String[] args) {
		Test test = new Test();
		int[] nums = {2,3,4,2,3};
		int result = test.singleNumber(nums);
		System.out.println("single nums is " + result);
	}
	
	
	public int singleNumber(int[] nums) {
		int result = 0;
		for(int i=0; i<nums.length;i++){
			result = result ^ nums[i];
		}
		
		return result;
	}

}
