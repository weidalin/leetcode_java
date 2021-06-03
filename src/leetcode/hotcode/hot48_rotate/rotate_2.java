package leetcode.hotcode.hot48_rotate;

/**
 * 48. 旋转图像
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 *
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 *
 *
 * 示例 1：
 *
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[7,4,1],[8,5,2],[9,6,3]]
 */
public class rotate_2 {
    public static void rotate(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
//        new_matrix[rows-j-1][i] = matrix[i][j]
        int[][] new_matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                new_matrix[rows - j - 1][i] = matrix[i][j];
            }
        }
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = new_matrix[i][j];
            }
        }

    }
}
