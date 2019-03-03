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
	 * ����һ��ż�����ȵ����飬���в�ͬ�����ִ����Ų�ͬ������ǹ���ÿһ�����ִ���һ���ǹ���
	 * ����Ҫ����Щ�ǹ�ƽ���ָ�һ���ܵܺ�һ�����á��������ÿ��Ի�õ�����ǹ���������
	 * @param candies
	 * @return
	 */
	public int distributeCandies(int[] candies) {
		int result = 0;	
		int n = candies.length; //�����ܹ��õ����ǹ���Ϊn/2	
		HashSet<Integer> set = new LinkedHashSet<Integer>(); //set���ܴ洢ͬ������
		
		for(int i=0;i<n;i++)
			set.add(candies[i]);
		
		if(set.size() > n/2)
			result = n/2;  //�ܵ��ǹ�����������û�õ��ǹ�����
		else
			result = set.size();	
		
		return result;
        
	}

}
