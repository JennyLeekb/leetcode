package com.lkb.demo19;

public class Solution {

	public static void main(String[] args) {
		String s = "mwwfjysbkebpdjyabcfkgprtxpwvhglddhmvaprcvrnuxifcrjpdgnktvmggmguiiquibmtviwjsqwtchkqgxqwljouunurcdtoeygdqmijdympcamawnlzsxucbpqtuwkjfqnzvvvigifyvymfhtppqamlgjozvebygkxawcbwtouaankxsjrteeijpuzbsfsjwxejtfrancoekxgfyangvzjkdskhssdjvkvdskjtiybqgsmpxmghvvicmjxqtxdowkjhmlnfcpbtwvtmjhnzntxyfxyinmqzivxkwigkondghzmbioelmepgfttczskvqfejfiibxjcuyevvpawybcvvxtxycrfbcnpvkzryrqujqaqhoagdmofgdcbhvlwgwmsmhomknbanvntspvvhvccedzzngdywuccxrnzbtchisdwsrfdqpcwknwqvalczznilujdrlevncdsyuhnpmheukottewtkuzhookcsvctsqwwdvfjxifpfsqxpmpwospndozcdbfhselfdltmpujlnhfzjcgnbgprvopxklmlgrlbldzpnkhvhkybpgtzipzotrgzkdrqntnuaqyaplcybqyvidwcfcuxinchretgvfaepmgilbrtxgqoddzyjmmupkjqcypdpfhpkhitfegickfszermqhkwmffdizeoprmnlzbjcwfnqyvmhtdekmfhqwaftlyydirjnojbrieutjhymfpflsfemkqsoewbojwluqdckmzixwxufrdpqnwvwpbavosnvjqxqbosctttxvsbmqpnolfmapywtpfaotzmyjwnd";
		System.out.println(new Solution().longestPalindrome(s));
	}

	/**
	 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
	 * 
	 * @param s
	 * @return
	 */
	public String longestPalindrome(String s) {
		String result = null;
		int length = s.length();
		if (length == 0)
			return s;
		char[] ch = s.toCharArray();

		
		int maxLen = 0;
		int[] temp = new int[2];

		for (int i = 0; i < length; i++) {
			for (int j = length - 1; j > i; j--) {
				int k=i,l=j;
				int count = 0;
				int begin = 0, end = 0;
				while(k<l && ch[k] == ch[l]){
					if (count == 0) {
						begin = k;
						end = l;
					}
					count++;
					k++;
					l--;
				}
				if (k >= l && end - begin > maxLen) {
					maxLen = end - begin;
					temp[0] = begin;
					temp[1] = end;
				}
			}	
		}

		result = String.copyValueOf(ch, temp[0], temp[1] - temp[0] + 1);

		return result;
	}
	
	
}