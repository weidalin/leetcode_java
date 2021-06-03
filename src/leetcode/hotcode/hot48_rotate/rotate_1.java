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
public class rotate_1 {
    public static void rotate(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        //水平翻转
        for(int i = 0; i < rows / 2; i ++){
            for(int j = 0; j < cols; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[rows - i - 1][j];
                matrix[rows - i - 1][j] = tmp;

            }
        }

        for(int i = 0; i < rows; i ++){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("==============");
        //对角线翻转
        for(int i = 0; i < rows; i ++){
            for(int j = 0; j < i; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for(int i = 0; i < rows; i ++){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
