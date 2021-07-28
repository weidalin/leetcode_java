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
public class maximalSquare_2 {
    public static int maximalSquare(char[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int len = Math.min(row, col);
        while(len > 0){
            for(int i = 0; i <= row - len; i++){
                for(int j = 0; j <= col - len; j++){
                    if(compute(matrix, i, j, len)){
                        return len * len;
                    }
                }
            }
            len --;
        }
        return 0;
    }

    private static boolean compute(char[][] matrix, int i, int j, int len) {
        for(int ii = 0; ii < len; ii++){
            for(int jj = 0; jj < len; jj++){
                if(matrix[i + ii][j+jj] == '0'){
                    return false;
                }
            }
        }
        return true;
    }
}
