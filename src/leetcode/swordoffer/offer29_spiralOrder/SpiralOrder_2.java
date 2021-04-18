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
public class SpiralOrder_2 {
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = cols - 1, top = 0, bottom = rows - 1;
        int[] res = new int[rows * cols];
        int index = 0;
        while(left <= right && top <= bottom){
            //1.-->
            for(int col = left; col <= right; col++){
                res[index++] = matrix[top][col];
            }
            //2.  |v
            for(int row = top + 1; row <= bottom; row++){
                res[index++] = matrix[row][right];
            }
            if(left < right && top < bottom){//避免在单行的情况下，做了两次添加
                //3. <--
                for(int col = right - 1; col >= left; col--){
                    res[index++] = matrix[bottom][col];
                }
                //4. |^
                for(int row = bottom - 1; row > top; row--){
                    res[index++] = matrix[row][left];
                }
            }

            left++;
            right--;
            top++;
            bottom--;
        }
        return res;
    }
}
/**
 * 执行用时：
 * 1 ms
 * , 在所有 Java 提交中击败了
 * 97.56%
 * 的用户
 * 内存消耗：
 * 39.8 MB
 * , 在所有 Java 提交中击败了
 * 54.25%
 * 的用户
 */
