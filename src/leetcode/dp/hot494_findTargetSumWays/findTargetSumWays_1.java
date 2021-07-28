package leetcode.dp.hot494_findTargetSumWays;

/**
 * 494. 目标和
 * 给你一个整数数组 nums 和一个整数 target 。
 *
 * 向数组中的每个整数前添加 '+' 或 '-' ，然后串联起所有整数，可以构造一个 表达式 ：
 *
 * 例如，nums = [2, 1] ，可以在 2 之前添加 '+' ，在 1 之前添加 '-' ，然后串联起来得到表达式 "+2-1" 。
 * 返回可以通过上述方法构造的、运算结果等于 target 的不同 表达式 的数目。
 *
 * 示例 1：
 *
 * 输入：nums = [1,1,1,1,1], target = 3
 * 输出：5
 * 解释：一共有 5 种方法让最终目标和为 3 。
 * -1 + 1 + 1 + 1 + 1 = 3
 * +1 - 1 + 1 + 1 + 1 = 3
 * +1 + 1 - 1 + 1 + 1 = 3
 * +1 + 1 + 1 - 1 + 1 = 3
 * +1 + 1 + 1 + 1 - 1 = 3
 * 示例 2：
 *
 * 输入：nums = [1], target = 1
 * 输出：1
 */
public class findTargetSumWays_1 {
    public int findTargetSumWays(int[] nums, int target) {
//        dp[ i ][ j ] = dp[ i - 1 ][ j - nums[ i ] ] + dp[ i - 1 ][ j + nums[ i ] ]
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        if(Math.abs(target) > Math.abs(sum))
            return 0;

        int len = nums.length;
        int[][] dp = new int[len][2 * sum + 1];
        // 初始化
        if (nums[0] == 0){
            dp[0][sum] = 2;
        }else{
            dp[0][sum + nums[0]] = 1;
            dp[0][sum - nums[0]] = 1;
        }
        for (int i = 1; i < len; i++){
            for(int j = -sum; j <= sum; j++){
                if((j + nums[i]) > sum){ // + 不成立
                    dp[i][j + sum] = dp[i-1][j-nums[i] + sum] + 0;
                }else if ((j - nums[i]) < -sum){ // - 不成立
                    dp[i][j+sum] = dp[i-1][j + nums[i] + sum ] + 0;
                }else { // +- 都可以
                    dp[i][j+sum] = dp[i-1][j+nums[i]+sum]+dp[i-1][j-nums[i]+sum];
                }
            }
        }
        return dp[len-1][sum + target];
    }
}
