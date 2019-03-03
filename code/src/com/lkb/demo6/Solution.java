package com.lkb.demo6;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Solution {
	
	public static void main(String[] args) {
		 int[] candies = {1,1,2,2,3,3};
		 Solution solution = new Solution();
		 System.out.println(solution.distributeCandies(candies));
	}
	
	
	/**
	 * 给定一个偶数长度的数组，其中不同的数字代表着不同种类的糖果，每一个数字代表一个糖果。
	 * 你需要把这些糖果平均分给一个弟弟和一个妹妹。返回妹妹可以获得的最大糖果的种类数
	 * @param candies
	 * @return
	 */
	public int distributeCandies(int[] candies) {
		int result = 0;	
		int n = candies.length; //妹妹能够得到的糖果数为n/2	
		HashSet<Integer> set = new LinkedHashSet<Integer>(); //set不能存储同样的数
		
		for(int i=0;i<n;i++)
			set.add(candies[i]);
		
		if(set.size() > n/2)
			result = n/2;  //总的糖果种类大于妹妹获得的糖果数量
		else
			result = set.size();	
		
		return result;
        
	}

}
