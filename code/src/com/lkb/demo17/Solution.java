package com.lkb.demo17;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		String str = "abcabcbb";
		System.out.println(new Solution().lengthOfLongestSubstring(str));
	}

	/**
	 * 请你找出其中不含有重复字符的 最长子串 的长度。
	 * 
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {

		char[] ch = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		int i = 0, j = 0;
		int maxLen = 0;
		while (j < ch.length && i <= j) {
			if (map.get(ch[j]) == null || map.get(ch[j]) < i) {
				map.put(ch[j], j);
				j++;
			} else {
				if (j - i > maxLen) {
					maxLen = j - i;
				}
				i = map.get(ch[j]) + 1;
				map.put(ch[j], j);
				j++;
			}
		}
		
		if (j - i > maxLen)
			maxLen = j - i;

		return maxLen;
	}

}
