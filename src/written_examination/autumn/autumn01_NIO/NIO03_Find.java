package written_examination.autumn.autumn01_NIO;

/**
 * 原题：二维矩阵里查找target
 * https://leetcode-cn.com/problems/search-a-2d-matrix-ii/
 */
public class NIO03_Find {
    public boolean Find(int target, int [][] array) {

        int row = array.length;
        if(row <= 0 || array == null){
            return false;
        }

        for(int i = row-1; i >= 0; i--){
            int left = 0, right = array[0].length;
            while(left < right){
                int mid = (left + right) / 2;
                if(array[i][mid] == target) {
                    return true;
                }else if(array[i][mid] > target){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
        }
        return false;
    }
}
