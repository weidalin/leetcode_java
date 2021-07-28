package leetcode.hotcode.hot221_maximalSquare;

/**
 * 221. 最大正方形
 * 在一个由 '0' 和 '1' 组成的二维矩阵内，找到只包含 '1' 的最大正方形，并返回其面积。
 *
 * 示例 1：
 *
 * 输入：matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
 * 输出：4
 */
public class maximalSquare_1 {
    public static int maximalSquare(char[][] matrix) {
        // 伪代码
//      dp[i][j] = min(dp[i - 1][j - 1], dp[i - 1][j], dp[i][j - 1]) + 1;

        int row = matrix.length, col = matrix[0].length;
        if(row < 1 || col < 1 || matrix == null)    return 0;
        int max = 0;

        int[][] dp = new int[row + 1][col + 1];
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                if(matrix[i-1][j-1] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j-1]) + 1;
                }else{
                    dp[i][j] = 0;
                }
                max = Math.max(dp[i][j], max);
            }
        }
        return max * max;
    }
}
