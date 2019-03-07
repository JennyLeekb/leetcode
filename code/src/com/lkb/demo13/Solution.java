package com.lkb.demo13;

import java.util.HashMap;

public class Solution {
	
	
	public static void main(String[] args) {
		int [][]trust = {{1,2},{2,3}};
		int N = 3;
		
		int r = new Solution().findJudge(N, trust);
		System.out.println(r);
	}
	

	/**
	 * 
	 * ��һ��С������� 1 �� N ����� N ���ˡ����Գƣ���Щ������һ����С���ϵ����ܷ��١�
	 * ���С��ķ�����Ĵ��ڣ���ô��
	 * С��ķ��ٲ������κ��ˡ�
	 * ÿ���ˣ�����С�򷨹��⣩������С��ķ��١�
	 * ֻ��һ����ͬʱ�������� 1 ������ 2 ��
	 * �������� trust�������������ζ� trust[i] = [a, b] ��ɣ���ʾ���Ϊ a �������α��Ϊ b ���ˡ�
	 * ���С��������ܷ��ٲ��ҿ���ȷ��������ݣ��뷵�ظ÷��ٵı�ǡ����򣬷��� -1
	 * @param N
	 * @param trust
	 * @return
	 */
	public int findJudge(int N, int[][] trust) {
		
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int n = trust.length;
		for(int i = 0;i<n;i++){
			hashMap.put(trust[i][0], trust[i][1]);
		}
		
		for(int i=1;i<=N;i++){
			if(hashMap.get(i) == null && hashMap.containsValue(i))
				return i;
		}
		
		return -1;
	}

}
