package leetcode.swordoffer.offer13_movingCount;

/**
 * 剑指 Offer 13. 机器人的运动范围
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 *
 *
 *
 * 示例 1：
 *
 * 输入：m = 2, n = 3, k = 1
 * 输出：3
 * 示例 2：
 *
 * 输入：m = 3, n = 1, k = 0
 * 输出：1
 */
public class movingCount_1 {
    static boolean[][] visited;
    static int mm, nn, kk;
    public static int movingCount(int m, int n, int k) {
        int cur_row = 0, cur_col = 0;
        mm = m;
        nn = n;
        kk = k;
        visited = new boolean[m][n];
        return dfs(cur_row, cur_col);
    }

    private static int dfs(int cur_row, int cur_col) {
        int tmp = count(cur_row, cur_col);
        if(cur_row >= mm || cur_col >= nn || tmp > kk)
            return 0;
        visited[cur_row][cur_col] = true;
        return 1 + dfs(cur_row + 1, cur_col) + dfs(cur_row, cur_col + 1);
    }

    private static int count(int cur_row, int cur_col) {
        int sum = 0;
        while(cur_row != 0){
            sum += cur_row % 10;
            cur_row /= 10;
        }
        while(cur_col != 0){
            sum += cur_col % 10;
            cur_col /= 10;
        }
        return sum;
    }
}
/**
 * 时间复杂度 O(MN)O(MN) ： 最差情况下，机器人遍历矩阵所有单元格，此时时间复杂度为 O(MN)O(MN) 。
 * 空间复杂度 O(MN)O(MN) ： 最差情况下，Set visited 内存储矩阵所有单元格的索引，使用 O(MN)O(MN) 的额外空间。
 *
 * 作者：jyd
 * 链接：https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/solution/mian-shi-ti-13-ji-qi-ren-de-yun-dong-fan-wei-dfs-b/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
