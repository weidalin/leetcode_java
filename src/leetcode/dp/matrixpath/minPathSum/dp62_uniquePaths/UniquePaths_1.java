package leetcode.dp.matrixpath.minPathSum.dp62_uniquePaths;

/**
 * 62. 不同路径
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 *
 * 问总共有多少条不同的路径？
 *
 *
 *
 * 示例 1：
 *
 *
 * 输入：m = 3, n = 7
 * 输出：28
 */
public class UniquePaths_1 {
    public  static int uniquePaths(int m, int n) {
        //dp[][] dp[0][:] = 1, dp[:][0] = 1;
        //dp[row][col] = dp[row-1][col] + dp[row][col-1]
        int[][] dp = new int[m][n];
        for(int row = 0; row < m; row++){
            dp[row][0] = 1;
        }for(int col = 0; col < n; col++){
            dp[0][col] = 1;
        }
        for(int row = 1; row < m; row++)
            for(int col = 1; col < n; col++)
                dp[row][col] = dp[row-1][col] + dp[row][col-1];
        return dp[m-1][n-1];
    }
    /**
     * 执行用时：
     * 0 ms
     * , 在所有 Java 提交中击败了
     * 100.00%
     * 的用户
     * 内存消耗：
     * 35.1 MB
     * , 在所有 Java 提交中击败了
     * 76.10%
     * 的用户
     */
}
