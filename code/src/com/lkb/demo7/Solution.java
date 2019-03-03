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
	 * ����һ����������������ͳ������������������������֮����ȣ����ǳ���Ϊ������������
	 * ����һ�� ������ n�� ������������������� True�����򷵻� False
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
