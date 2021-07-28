package leetcode.hotcode.hot416_canPartition;

/**
 * 416. 分割等和子集
 * 给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 *
 * 示例 1：
 *
 * 输入：nums = [1,5,11,5]
 * 输出：true
 * 解释：数组可以分割成 [1, 5, 5] 和 [11] 。
 * 示例 2：
 *
 * 输入：nums = [1,2,3,5]
 * 输出：false
 * 解释：数组不能分割成两个元素和相等的子集。
 */
public class canPartition_2 {
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int n = nums.length;
        long[][] dp = new long[n][2 * sum + 1];
        if(nums[0] == 0){
            dp[0][sum] = 2;
        }else{
            dp[0][sum + nums[0]] = 1;
            dp[0][sum -nums[0]] = 1;
        }
        for(int i = 1; i < n; i++){
            for(int j = -sum; j <= sum; j++){

                if(j + nums[i] > sum){
                    dp[i][j + sum] = dp[i-1][j - nums[i] + sum];
                }else if(j - nums[i] < -sum){
                    dp[i][j + sum] = dp[i-1][j + nums[i] + sum];
                }else{
                    dp[i][j + sum] = dp[i-1][j - nums[i] + sum] + dp[i-1][j + nums[i] + sum] ;
                }


            }
        }
        return dp[n-1][sum] > 0;
    }
}
