package leetcode.easy.easy53_maximum_subarray;

public class MaxSubArray_2 {
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
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if (max_sum < sum)
                    max_sum = sum;
            }
        }
        return max_sum;
    }
}
/**
 * 执行用时：
 * 163 ms
 * , 在所有 Java 提交中击败了
 * 5.03%
 * 的用户
 * 内存消耗：
 * 38.5 MB
 * , 在所有 Java 提交中击败了
 * 42.76%
 * 的用户
 */
