package leetcode.hotcode.hot240_searchMatrix;

/**
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-a-2d-matrix-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 输入：matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
 * 输出：true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-a-2d-matrix-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class searchMatrix_2 {
    /**
     * 暴力， 超时啦！！！
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        return dfs(matrix, target, 0, 0);
    }

    private boolean dfs(int[][] matrix, int target, int i, int j) {
        if(i >= matrix.length || j >= matrix[0].length)   return false;
        if(matrix[i][j] < target){
            return dfs(matrix, target, i + 1, j) || dfs(matrix, target, i, j+1);
        }else if(matrix[i][j] == target){
            return true;
        }
        return false;
    }
}
