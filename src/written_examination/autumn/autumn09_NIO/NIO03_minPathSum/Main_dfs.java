package written_examination.autumn.autumn09_NIO.NIO03_minPathSum;

/**
 * @author linweida
 * 2021/8/28 7:34 下午
 */

public class Main_dfs {
    public int minPathSum (int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int rows = matrix.length, cols = matrix[0].length;
        int[] dp = new int[cols];
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if(col == 0) //第一列，只能向下走
                    dp[col] = dp[col];
                else if(row == 0 )//第一行，只能想右走
                    dp[col] = dp[col - 1];
                else
                    dp[col] = Math.min(dp[col - 1], dp[col]);
                dp[col] += matrix[row][col];
            }
        }
        return dp[cols - 1];
    }


}
