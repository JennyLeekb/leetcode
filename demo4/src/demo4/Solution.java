package demo4;

public class Solution {
	
	public static void main(String[] args) {
		int[][] matrix = {
				{1,   4,  7, 11, 15},
				{2,   5,  8, 12, 19},
				{3,   6,  9, 16, 22},
				{10, 13, 14, 17, 24},
				{18, 21, 23, 26, 30}
			};
		Solution solution = new Solution();
		boolean result = solution.searchMatrix(matrix, 5);
		if(result)
			System.out.println("exist!\n");
		else
			System.out.println("not exist!\n");
	}
	
	/*
	 * ���Ҿ���matrix���Ƿ���Ԫ��target
	 * */
	public boolean searchMatrix(int[][] matrix, int target) {
		boolean result = false;
		int m = matrix.length; //����
		int n = matrix[0].length; //����

		for(int i=0;i<m-1;){ //�����Ͻǿ�ʼ����
			for(int j=n-1;j>=0;){
				if(matrix[i][j] == target){
					result = true;
					break;
				}
				else if(matrix[i][j] > target){
					j--;
				}
				else if(i<m-1)  //����ע���ж�
					i++;
				else
					break;
								
			}
			if(result)
				break;
		}
		
        return result;
    }
}
