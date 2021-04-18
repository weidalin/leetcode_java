package leetcode.swordoffer.offer29_spiralOrder;

/**
 * 剑指 Offer 29. 顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 *
 *
 *
 * 示例 1：
 *
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 * 示例 2：
 *
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 *
 */
public class SpiralOrder_1 {
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        int rows = matrix.length, cols = matrix[0].length;
        int n = rows * cols;
        int[] res = new int[n];
        boolean[][] visited = new boolean[rows][cols];
        int[][] trend = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int trend_index = 0;
        int cur_row = 0, cur_col = 0;
        int i = 0;
        while(i < n){
            res[i] = matrix[cur_row][cur_col];
            visited[cur_row][cur_col] = true;
            int next_row = cur_row + trend[trend_index][0];
            int next_col = cur_col + trend[trend_index][1];
            if(next_row < 0 || next_row >= rows ||
                    next_col < 0 || next_col >= cols ||
                    visited[next_row][next_col] == true ) {//判断边界
                trend_index = (trend_index + 1) % 4;
            }
            cur_row = cur_row + trend[trend_index][0];
            cur_col = cur_col + trend[trend_index][1];
            i++;
        }
        return res;
    }
}
/**
 * 执行用时：
 * 4 ms
 * , 在所有 Java 提交中击败了
 * 16.99%
 * 的用户
 * 内存消耗：
 * 39.8 MB
 * , 在所有 Java 提交中击败了
 * 57.43%
 * 的用户
 */
