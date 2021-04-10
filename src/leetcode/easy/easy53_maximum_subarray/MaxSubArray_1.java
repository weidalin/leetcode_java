package leetcode.easy.easy53_maximum_subarray;

public class MaxSubArray_1 {
    /**
     * 53. 最大子序和
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     *
     *
     *
     * 示例 1：
     *
     * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
     * 输出：6
     * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        //动态规划
        //f(i)=max{f(i−1)+nums[i],nums[i]}
        int pre = 0, max_sum = nums[0];
        for(int num : nums){
            pre = Math.max(pre + num, num);
            max_sum = Math.max(max_sum, pre);
        }
        return max_sum;
    }
}
/**
 * 执行用时：
 * 1 ms
 * , 在所有 Java 提交中击败了
 * 94.73%
 * 的用户
 * 内存消耗：
 * 38.6 MB
 * , 在所有 Java 提交中击败了
 * 11.35%
 * 的用户
 */
