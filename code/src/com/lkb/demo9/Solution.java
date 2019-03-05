package com.lkb.demo9;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		String ransomNote = "aa";
		String magazine = "aab";
		if(new Solution().canConstruct(ransomNote, magazine)){
			System.out.println("can !\n");
		}else
			System.out.println("can not !\n");
	}
	
	
	/**
	 * 赎金信是否能够由杂志构成
	 * @param ransomNote
	 * @param magazine
	 * @return
	 */
	public boolean canConstruct(String ransomNote, String magazine) {
		boolean result = true;
		
		char[] ran  = ransomNote.toCharArray();
		char[] mag = magazine.toCharArray();		
		
		HashMap<Character, Integer> magHash = new HashMap<Character, Integer>();
		
		for(char m : mag){
			if(magHash.containsKey(m)){
				int k = magHash.get(m);
				k++;
				magHash.put(m, k);
			}else{
				magHash.put(m, 1);
			}	
		}
		
		for(char r : ran){
			if(!magHash.containsKey(r)){
				return false;				
			}
			else{
				int k = magHash.get(r);
				if(k <= 0)
					return false;
				k--;
				magHash.put(r, k);
			}
		}
			
		return result;
	}

}
