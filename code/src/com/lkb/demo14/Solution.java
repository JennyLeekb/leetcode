package com.lkb.demo14;

public class Solution {

	public static void main(String[] args) {
		System.out.println(new Solution().reachNumber(5));

	}

	/**
	 * https://blog.csdn.net/wx734518351/article/details/80559412
	 * @param target
	 * @return
	 */
	public int reachNumber(int target) {
		if (target < 0)
			return reachNumber(-target);
		int i = 0;
		while (i * (i + 1) < 2 * target) {
			i++;
		}
		if (i * (i + 1) == 2 * target)
			return i;
		else {
			if ((i * (i + 1) / 2 - target) % 2 == 0)
				return i;
			else {
				if (i % 2 == 0)
					return i + 1;
				else
					return (i + 2);
			}
		}
	}

}
