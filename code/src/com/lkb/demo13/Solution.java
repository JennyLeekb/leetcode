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
	 * 在一个小镇里，按从 1 到 N 标记了 N 个人。传言称，这些人中有一个是小镇上的秘密法官。
	 * 如果小镇的法官真的存在，那么：
	 * 小镇的法官不相信任何人。
	 * 每个人（除了小镇法官外）都信任小镇的法官。
	 * 只有一个人同时满足属性 1 和属性 2 。
	 * 给定数组 trust，该数组由信任对 trust[i] = [a, b] 组成，表示标记为 a 的人信任标记为 b 的人。
	 * 如果小镇存在秘密法官并且可以确定他的身份，请返回该法官的标记。否则，返回 -1
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
