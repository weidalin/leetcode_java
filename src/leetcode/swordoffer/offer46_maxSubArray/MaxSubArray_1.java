package leetcode.swordoffer.offer46_maxSubArray;

/**
 * 剑指 Offer 42. 连续子数组的最大和
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 *
 *
 *
 * 示例1:
 *
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class MaxSubArray_1 {
//    dp[i] = dp[i-1] + nums[i];
//            = nums[i]
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++){
              nums[i] += Math.max(nums[i-1], 0);
              if(nums[i] > res){
                  res = nums[i];
              }
        }
        return res;
    }
}
/**
 *执行用时：
 * 1 ms
 * , 在所有 Java 提交中击败了
 * 98.46%
 * 的用户
 * 内存消耗：
 * 45.4 MB
 * , 在所有 Java 提交中击败了
 * 5.26%
 * 的用户
 *
 */
