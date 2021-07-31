package written_examination.autumn.autmn03_yidian.yidian02_zuixiaolujing;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param mapArray int整型二维数组
     * @return int整型
     */
    static int res, rows, cols;
    static int[][] nums;
    public static int findMin (int[][] mapArray) {
        // write code here
        res = Integer.MAX_VALUE;
        nums = mapArray;
        if(mapArray == null || mapArray.length == 0 || mapArray[0].length == 0) return 0;
        rows = mapArray.length;
        cols = mapArray[0].length;
        dfs(0,0, 0);
        return res;
    }

    private static void dfs(int i, int j, int tmp) {
        if(i >= rows || j >= cols)
            return;
        tmp += nums[i][j];
        if(i == rows - 1 && j == cols - 1){
            if(tmp < res)   {
                res = tmp;
            }
        }
        dfs(i + 1, j, tmp);
        dfs(i, j+1,tmp);
    }

    public static void main(String[] args) {
        int[][] nums = {{1,3,1},{1,5,1},{4,2,1}};
        int res = findMin(nums);
        System.out.println(res);
    }
}

