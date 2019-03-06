package com.lkb.demo11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Solution {

	public static void main(String[] args) {
		String pattern = "abba";
		String str = "dog cat cat dog";
		if (new Solution().wordPattern(pattern, str))
			System.out.println("匹配");
		else
			System.out.println("不匹配");
	}

	/**
	 * 查看单词str是否匹配模式pattern
	 * 
	 * @param pattern
	 * @param str
	 * @return
	 */
	public boolean wordPattern(String pattern, String str) {
		char[] p = pattern.toCharArray();
		String[] s = str.split(" ");

		HashMap<Character, String> pMap = new HashMap<Character, String>();
		for (int i = 0; i < p.length; i++) {
			if (pMap.containsKey(p[i])) {
				String v = pMap.get(p[i]);
				v = v + i;
				pMap.put(p[i], v);
			} else {
				pMap.put(p[i], String.valueOf(i));
			}
		}

		HashMap<String, String> sMap = new HashMap<String, String>();
		for (int i = 0; i < s.length; i++) {
			if (sMap.containsKey(s[i])) {
				String v = sMap.get(s[i]);
				v = v + i;
				sMap.put(s[i], v);
			} else {
				sMap.put(s[i], String.valueOf(i));
			}
		}

		Collection<String> values = pMap.values();
		Iterator<String> it = values.iterator();
		while (it.hasNext()) {
			String v = it.next();
			if (!sMap.containsValue(v))
				return false;

		}

		return true;
	}

}
