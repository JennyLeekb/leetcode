package com.lkb.demo5;

public class Solution {
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3,n = 3;
		
		Solution solution = new Solution();
		solution.merge(nums1, m, nums2, n);
		
		for(int i=0;i<m+n;i++){
			System.out.print(" " + nums1[i]);
		}
	}
	
	
	
	/**
	 * �������������������� nums1 �� nums2��
	 * �� nums2 �ϲ��� nums1 �У�ʹ�� num1 ��Ϊһ���������顣
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m+n]; //������
        int i=0,j=0,k=0;
        
        while(i<m && j<n){
        	if(nums1[i] <= nums2[j])
        		nums[k++] = nums1[i++];
        	else
        		nums[k++] = nums2[j++];
        }
        
        if(i<m){
        	while(i<m)
        		nums[k++] = nums1[i++];      		
        }
        
        if(j<n){
        	while(j<n)
        		nums[k++] = nums2[j++];
        }
        	
        System.arraycopy(nums, 0, nums1, 0, nums.length);
        
    }

}
