package leetcode.dp.fib.dp281_robII;

/**
 * 213. 打家劫舍 II
 * 你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都 围成一圈 ，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，能够偷窃到的最高金额。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [2,3,2]
 * 输出：3
 * 解释：你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
 */
public class robII_1 {
    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return nums[0];
        return Math.max(robII_helper(nums, 0, n -1), robII_helper(nums, 1, n));
    }

    private static int robII_helper(int[] nums, int first, int last) {
        //dp[i] = max(dp[i-2] + nums[i] , dp[i-1])
        int pre2 = 0, pre1 = 1;
        for (int i = first; i < last; i++){
            int cur = Math.max(pre2 + nums[i], pre1);
            pre2 = pre1;
            pre1 = cur;
        }
        System.out.println("  first: " + first + "  last: " + last +  " pre1: " + pre1);
        return pre1;
    }
    /**
     * 执行结果：
     * 通过
     * 显示详情
     * 执行用时：
     * 0 ms
     * , 在所有 Java 提交中击败了
     * 100.00%
     * 的用户
     * 内存消耗：
     * 35.8 MB
     * , 在所有 Java 提交中击败了
     * 64.41%
     * 的用户
     * 炫耀一下:
     */
}
