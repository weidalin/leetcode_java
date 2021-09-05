package leetcode.dp.matrixpath.minPathSum.dp64_minPathSum;

import static tools.Weida_utils.print_2darr;

/**
 * 64. 最小路径和
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 *
 *
 *
 * 示例 1：
 *
 *
 * 输入：grid = [[1,3,1],[1,5,1],[4,2,1]]
 * 输出：7
 * 解释：因为路径 1→3→1→1→1 的总和最小。
 */
public class minPathSum_2 {
    public static int minPathSum(int[][] grid) {
        //dp[][]
        //二维的dp表， 先初始化第一行和第一列, dp[0][0] = grid[0]
        //i > 0 && j == 0, dp[i][0] = dp[i-1][0] + grid[i][0] //第一列
        //i == 0, j > 1,  dp[i][j] = dp[0][j-1] + grid[i][j]    //第一行
        //dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j] //其他
        if (grid == null)
            return -1;
        int rows = grid.length, cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        dp[0][0] = grid[0][0];
        for(int row = 1; row < rows; row++){//init first col
            dp[row][0] = dp[row-1][0] + grid[row][0];
        }
        for(int col = 1; col < cols; col++){//init first row
            dp[0][col] = dp[0][col-1] + grid[0][col];
        }
        for(int row = 1; row < rows; row++){
            for(int col = 1; col < cols; col++){
                dp[row][col] = Math.min(dp[row-1][col], dp[row][col-1]) + grid[row][col];
            }
        }
        print_2darr(dp);
        return dp[rows-1][cols-1];

    }
    /**
     * 执行用时：
     * 3 ms
     * , 在所有 Java 提交中击败了
     * 87.69%
     * 的用户
     * 内存消耗：
     * 41.1 MB
     * , 在所有 Java 提交中击败了
     * 70.96%
     * 的用户
     */
}
