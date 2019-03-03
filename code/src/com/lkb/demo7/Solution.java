package com.lkb.demo7;

public class Solution {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		if(solution.checkPerfectNumber(28))
			System.out.println("yes");
		else
			System.out.println("no");
		
	}
	
	/**
	 * 对于一个正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。
	 * 给定一个 正整数 n， 如果他是完美数，返回 True，否则返回 False
	 * @param num
	 * @return
	 */
	public boolean checkPerfectNumber(int num) {
		boolean result = false;
		int i,sum=0;
		
		for(i=1;i<=Math.sqrt(num);i++){
			if(num%i == 0){
				if(i==1)
					sum = sum + i;
				else{
					sum = sum + i + num/i;
				}
			}
				
		}
		
		if(sum == num)
			result = true;
		else 
			result = false;
		
		return result;
	}

}
