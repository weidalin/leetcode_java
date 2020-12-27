package src.leetcode.hotcode.hot1_twosum;

/*
1. 两数之和
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

示例:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
通过次数1,639,711提交次数3,301,766
 */

/**\
 * 1.暴力枚举
 *
 * 时间复杂度：O(N^2)O(N
 * 2
 *  )，其中 NN 是数组中的元素数量。最坏情况下数组中任意两个数都要被匹配一次。
 *
 * 空间复杂度：O(1)O(1)。
 */
public class TwoSum1 {
    public static int[] twoSum_1(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len -1; i++){
            for (int j = i+1; j < len; j++){
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        //else
        return new int[0];
    }


}
