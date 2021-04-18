package leetcode.dp.matrixpath.minPathSum.dp64_minPathSum;

import java.util.Arrays;

import static tools.Weida_utils.*;

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
public class minPathSum_1 {
    public static int minPathSum(int[][] grid) {
        //dp[] = min(dp[col-1], dp[col]) + grid[row][col]
        if (grid.length == 0 || grid[0].length == 0)
            return 0;
        int rows = grid.length, cols = grid[0].length;
        int[] dp = new int[cols];
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if(col == 0) //第一列，只能向下走
                    dp[col] = dp[col];
                else if(row == 0 )//第一行，只能想右走
                    dp[col] = dp[col - 1];
                else
                    dp[col] = Math.min(dp[col - 1], dp[col]);
                dp[col] += grid[row][col];
            }
            print_arr(dp);
            System.out.println();
        }
        return dp[cols - 1];
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
     * 68.02%
     * 的用户
     */
}
