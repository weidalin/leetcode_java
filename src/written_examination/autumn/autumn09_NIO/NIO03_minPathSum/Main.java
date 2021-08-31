package written_examination.autumn.autumn09_NIO.NIO03_minPathSum;

/**
 * @author linweida
 * 2021/8/28 7:34 下午
 */
// 100%
public class Main {
    int res;
    public int minPathSum (int[][] matrix) {
        // write code here
        res = Integer.MAX_VALUE;
        dfs(matrix, 0, 0, 0);
        return res;
    }

    private void dfs(int[][] matrix, int i, int j, int cur) {
        if(i == matrix.length-1 && j == matrix[0].length-1){
            res = Math.min(res, cur);
            return;
        }

        if(i >= matrix.length || j >= matrix[0].length){
            return;
        }
        cur += matrix[i][j];
        dfs(matrix, i + 1, j, cur);
        dfs(matrix, i, j+1, cur);
    }

}
