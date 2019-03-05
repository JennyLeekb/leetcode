package com.lkb.demo10;

public class Solution {

	public static void main(String[] args) {

		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		
		System.out.println(new Solution().minPathSum(grid));

	}

	/**
	 * 求矩阵左上角到右下角的最短路径 动态规划的问题
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

		// 更新边缘节点距离
		for (int i = 1; i < row; i++) // 第一列
			path[i][0] = path[i - 1][0] + grid[i][0]; // 等于上一行的最短距离加上当前距离

		for (int j = 1; j < column; j++) // 第一行
			path[0][j] = path[0][j - 1] + grid[0][j]; // 等于上一列的最短距离加上当前距离

		// 更新中间数据
		for (int i = 1; i < row; i++)
			for (int j = 1; j < column; j++)// 等于上一行或者上一列中与当前行列相加的较小者
				path[i][j] = Math.min(path[i][j - 1] + grid[i][j], path[i - 1][j] + grid[i][j]);

		min = path[row - 1][column - 1];

		return min;
	}
}
