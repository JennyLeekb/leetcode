package com.lkb.demo18;

public class Solution {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2 ,6,8};
		int[] nums2 = { 3, 4 };
		System.out.println(new Solution().findMedianSortedArrays(nums1, nums2));
	}

	/**
	 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m
	 * + n))。 你可以假设 nums1 和 nums2 不会同时为空。
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	// public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	// double result = 0;
	// int m = nums1.length;
	// int n = nums2.length;
	// int[] newNum = new int[m+n]; //新数组存放排好序的数据
	// int i=0,j=0,k=0;
	// while(i<m && j<n){
	// if(nums1[i] < nums2[j]){
	// newNum[k++] = nums1[i];
	// i++;
	// }else{
	// newNum[k++] = nums2[j];
	// j++;
	// }
	// }
	//
	// if(i==m){//nums1数组已经全部存入新数组中
	// while(j<n)
	// newNum[k++] = nums2[j++];
	// }
	//
	// if(j==n){
	// while(i<m)
	// newNum[k++] = nums1[i++];
	// }
	// int length = newNum.length;
	// if(length % 2 == 0){ //新的数组长度为偶数
	// result = (newNum[(length-1)/2] +newNum[(length-1)/2 + 1])/2.0;
	// }else{
	// result = newNum[(length-1)/2];
	// }
	//
	// return result;
	// }

	/**
	 * https://blog.csdn.net/qq_41014682/article/details/79812181
	 * @param A
	 * @param B
	 * @return
	 */
	public double findMedianSortedArrays(int[] A, int B[]) {
		int m = A.length;
		int n = B.length;
		if (m > n) {// 保证m<n 意思就是B的长度大于等于A的长度
			int[] temp = A;
			A = B;
			B = temp;
			int tmp = m;
			m = n;
			n = tmp;
		}
		int iMin = 0, iMax = m, halfLen = (n + m + 1) / 2;
		while (iMin <= iMax) {
			int i = (iMin + iMax) / 2;
			int j = halfLen - i;
			if (i < iMax && B[j - 1] > A[i]) {
				iMin = iMin + 1;
			} else if (i > iMin && A[i - 1] > B[j]) {
				iMax = iMax - 1;
			} else {
				int maxLeft = 0;
				if (i == 0) {
					maxLeft = B[j - 1];
				} else if (j == 0) {
					maxLeft = A[i - 1];
				} else {
					maxLeft = Math.max(A[i - 1], B[j - 1]);
				}
				if ((m + n) % 2 == 1) {
					return maxLeft;
				}
				int minRight = 0;
				if (i == m) {
					minRight = B[j];
				} else if (j == n) {
					minRight = A[i];
				} else {
					minRight = Math.min(B[j], A[i]);
				}
				return (maxLeft + minRight) / 2.0;
			}
		}
		return 0.0;
	}

}
