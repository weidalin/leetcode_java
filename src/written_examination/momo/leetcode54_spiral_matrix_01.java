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
public class leetcode54_spiral_matrix_01 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return res;
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = cols -1, top = 0, bottom = rows - 1;
        while(left <= right && top <= bottom){
            //leff -->
            for (int column = left; column <= right; column++)
                res.add(matrix[top][column]);
            //down |
            for (int row = top + 1; row <= bottom; row++)
                res.add(matrix[row][right]);
            if(left < right && top < bottom){
                //right
                for(int column = right - 1; column > left; column--){
                    res.add(matrix[bottom][column]);
                }
                //up
                for(int row = bottom; row > top; row--)
                    res.add(matrix[row][left]);
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return res;
    }
}
/**
 * 执行用时：
 * 0 ms
 * , 在所有 Java 提交中击败了
 * 100.00%
 * 的用户
 * 内存消耗：
 * 36.9 MB
 * , 在所有 Java 提交中击败了
 * 7.23%
 * 的用户
 */
