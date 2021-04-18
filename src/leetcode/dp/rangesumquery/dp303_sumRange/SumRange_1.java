package leetcode.dp.rangesumquery.dp303_sumRange;

/**
 * 303. 区域和检索 - 数组不可变
 * 给定一个整数数组  nums，求出数组从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点。
 *
 * 实现 NumArray 类：
 *
 * NumArray(int[] nums) 使用数组 nums 初始化对象
 * int sumRange(int i, int j) 返回数组 nums 从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点（也就是 sum(nums[i], nums[i + 1], ... , nums[j])）
 *
 *
 * 示例：
 *
 * 输入：
 * ["NumArray", "sumRange", "sumRange", "sumRange"]
 * [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
 * 输出：
 * [null, 1, -1, -3]
 *
 * 解释：
 * NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
 * numArray.sumRange(0, 2); // return 1 ((-2) + 0 + 3)
 * numArray.sumRange(2, 5); // return -1 (3 + (-5) + 2 + (-1))
 * numArray.sumRange(0, 5); // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))
 */
public class SumRange_1 {
    private int[] sum;
    public void NumArray(int[] nums) {
        sum = new int[nums.length];
        for(int i = 1; i < nums.length; i++){
            sum[i] = sum[i-1] + nums[i-1];
        }
    }

    public int sumRange(int left, int right) {
        return sum[right+1] - sum[left];
    }
    /**
     * 执行用时：
     * 41 ms
     * , 在所有 Java 提交中击败了
     * 29.52%
     * 的用户
     * 内存消耗：
     * 42.6 MB
     * , 在所有 Java 提交中击败了
     * 6.78%
     * 的用户
     */
}
