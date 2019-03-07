package com.lkb.demo12;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static void main(String[] args) {
		int left = 1;
		int right = 22;
		List<Integer> list= new Solution().selfDividingNumbers(left, right);
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i) + " -> ");
		}
		
	}
	

	/**
	 * 自除数 是指可以被它包含的每一位数除尽的数。
	 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
	 * 还有，自除数不允许包含 0 。
	 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
	 * @param left
	 * @param right
	 * @return
	 */
//	public List<Integer> selfDividingNumbers(int left, int right) {
//		List<Integer> list = new ArrayList<Integer>();
//		
//		for(int i=left;i<=right;i++){
//			boolean flag = true;
//			String iStr = String.valueOf(i);
//			char[] iChar = iStr.toCharArray();
//			for(char c : iChar){
//				String t = Character.toString(c);
//				int l = Integer.parseInt(t);
//				if(l == 0 || i%l != 0){
//					flag = false;
//					break;
//				}			
//			}
//			if(flag)
//				list.add(i);
//		}
//		
//		return list;
//	}
	
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=left;i<=right;i++){
			int k = i;
			boolean flag = true;
			while(k!=0){
				int t = k%10;
				if(t==0 || i%t !=0){
					flag = false;
					break;
				}
				k = k/10;
			}
			if(flag)
				list.add(i);
		}
		
		return list;
	}
	

}
