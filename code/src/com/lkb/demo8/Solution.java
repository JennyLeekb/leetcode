package com.lkb.demo8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Solution {
	
	public static void main(String[] args) {
		List<Integer> list = new Solution().powerfulIntegers(2, 3, 10);

		for(int i=0;i<list.size();i++)
			System.out.print(" " + list.get(i));
	}
	
	/**
	 * 给定两个非负整数 x 和 y，
	 * 如果某一整数等于 x^i + y^j，其中整数 i >= 0 且 j >= 0，那么我们认为该整数是一个强整数。
	 * 返回值小于或等于 bound 的所有强整数组成的列表。
	 * 你可以按任何顺序返回答案。在你的回答中，每个值最多出现一次。
	 * @param x
	 * @param y
	 * @param bound
	 * @return
	 */
	public List<Integer> powerfulIntegers(int x, int y, int bound) {
		List<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new LinkedHashSet<Integer>();
		int i = 0,j = 0;
			
		for(i=0;;i++){
			for(j=0;;j++){
				int n = (int) (Math.pow(x, i) + Math.pow(y, j));
				if(n > bound)
					break;
				else	
				{
					set.add(n);				
				}
			}
			if(j==0)
				break;
		}
		
		list.addAll(set);
		
		return list;
	}

}
