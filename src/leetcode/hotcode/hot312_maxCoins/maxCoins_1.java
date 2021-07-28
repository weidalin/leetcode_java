package leetcode.hotcode.hot312_maxCoins;

import java.util.ArrayList;
import java.util.List;

/**
 * 312. 戳气球
 * 有 n 个气球，编号为0 到 n - 1，每个气球上都标有一个数字，这些数字存在数组 nums 中。
 *
 * 现在要求你戳破所有的气球。戳破第 i 个气球，你可以获得 nums[i - 1] * nums[i] * nums[i + 1] 枚硬币。
 * 这里的 i - 1 和 i + 1 代表和 i 相邻的两个气球的序号。如果 i - 1或 i + 1 超出了数组的边界，那么就当它是一个数字为 1 的气球。
 *
 * 求所能获得硬币的最大数量。
 *
 * 示例 1：
 * 输入：nums = [3,1,5,8]
 * 输出：167
 * 解释：
 * nums = [3,1,5,8] --> [3,5,8] --> [3,8] --> [8] --> []
 * coins =  3*1*5    +   3*5*8   +  1*3*8  + 1*8*1 = 167
 * 示例 2：
 *
 * 输入：nums = [1,5]
 * 输出：10
 */
public class maxCoins_1 {
    /**
     * dp[i][j] 表示开区间 (i,j) 内你能拿到的最多金币
     * @param nums
     * @return
     */
    public static int maxCoins(int[] nums) {
        int n = nums.length;
        int[] tmp = new int[n + 2];
        tmp[0] = 1;
        tmp[n + 1] = 1;
        for(int i = 0; i < n; i++){
            tmp[i + 1] = nums[i];
        }
        int[][] dp = new int[n + 2][n + 2];
        // len表示开区间长度
        for(int len=3; len<=n+2; len++){
            // i表示开区间左端点
            for(int i=0; i<=n+2-len; i++){
                int res = 0;
                // k为开区间内的索引
                for(int k = i+1; k<i+len-1; k++){
                    int left = dp[i][k];
                    int right = dp[k][i+len-1];
                    res = Math.max(res, left + tmp[i]*tmp[k]*tmp[i+len-1] + right);
                }
                dp[i][i+len-1] = res;
            }
        }
        return dp[0][n + 1];
    }
}
/**
 * 超时啦
 */
