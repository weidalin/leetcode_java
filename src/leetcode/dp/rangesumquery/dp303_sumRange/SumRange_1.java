package leetcode.dp.rangesumquery.dp303_sumRange;

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
