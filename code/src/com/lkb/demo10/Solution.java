package com.lkb.demo10;

public class Solution {

	public static void main(String[] args) {

		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		
		System.out.println(new Solution().minPathSum(grid));

	}

	/**
	 * ��������Ͻǵ����½ǵ����·�� ��̬�滮������
	 * 
	 * @param grid
	 * @return
	 */
	public int minPathSum(int[][] grid) {
		int min = 0;

		int row = grid.length;
		int column = grid[0].length;

		int[][] path = new int[row][column];

		path[0][0] = grid[0][0];

		// ���±�Ե�ڵ����
		for (int i = 1; i < row; i++) // ��һ��
			path[i][0] = path[i - 1][0] + grid[i][0]; // ������һ�е���̾�����ϵ�ǰ����

		for (int j = 1; j < column; j++) // ��һ��
			path[0][j] = path[0][j - 1] + grid[0][j]; // ������һ�е���̾�����ϵ�ǰ����

		// �����м�����
		for (int i = 1; i < row; i++)
			for (int j = 1; j < column; j++)// ������һ�л�����һ�����뵱ǰ������ӵĽ�С��
				path[i][j] = Math.min(path[i][j - 1] + grid[i][j], path[i - 1][j] + grid[i][j]);

		min = path[row - 1][column - 1];

		return min;
	}
}
