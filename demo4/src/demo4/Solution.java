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
	 * 查找矩阵matrix中是否有元素target
	 * */
	public boolean searchMatrix(int[][] matrix, int target) {
		boolean result = false;
		int m = matrix.length; //行数
		int n = matrix[0].length; //列数

		for(int i=0;i<m-1;){ //从右上角开始搜索
			for(int j=n-1;j>=0;){
				if(matrix[i][j] == target){
					result = true;
					break;
				}
				else if(matrix[i][j] > target){
					j--;
				}
				else if(i<m-1)  //这里注意判断
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
