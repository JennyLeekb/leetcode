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
	 * ���������Ǹ����� x �� y��
	 * ���ĳһ�������� x^i + y^j���������� i >= 0 �� j >= 0����ô������Ϊ��������һ��ǿ������
	 * ����ֵС�ڻ���� bound ������ǿ������ɵ��б�
	 * ����԰��κ�˳�򷵻ش𰸡�����Ļش��У�ÿ��ֵ������һ�Ρ�
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
