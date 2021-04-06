package written_examination.momo;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 *
 *
 *
 * 示例 1：
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 */
public class leetcode54_spiral_matrix_02 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> order = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return order;
        int rows = matrix.length, colums = matrix[0].length;
        boolean[][] visited = new boolean[rows][colums];
        int total = rows * colums;
        int cur_row = 0, cur_col = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};//represents left, down, right, up
        int directionIndex = 0;
        for(int i = 0; i < total; i++){
            order.add(matrix[cur_row][cur_col]);
            visited[cur_row][cur_col] = true;
            int nextRow = cur_row + directions[directionIndex][0], nextColumn = cur_col + directions[directionIndex][1];
            if(nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= colums || visited[nextRow][nextColumn] == true)
                directionIndex = (directionIndex + 1) % 4;
            cur_row += directions[directionIndex][0];
            cur_col += directions[directionIndex][1];
        }
        return order;
    }
}
/**
 * 执行用时：
 * 0 ms
 * , 在所有 Java 提交中击败了
 * 100.00%
 * 的用户
 * 内存消耗：
 * 36.5 MB
 * , 在所有 Java 提交中击败了
 * 72.84%
 * 的用户
 * 炫耀一下:
 */
