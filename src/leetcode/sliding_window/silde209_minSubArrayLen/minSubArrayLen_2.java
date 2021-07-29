package leetcode.sliding_window.silde209_minSubArrayLen;

public class minSubArrayLen_2 {
    /**
     * 209. 长度最小的子数组
     * 给定一个含有 n 个正整数的数组和一个正整数 target 。
     *
     * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
     *
     *
     *
     * 示例 1：
     *
     * 输入：target = 7, nums = [2,3,1,2,4,3]
     * 输出：2
     * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
     * 示例 2：
     *
     * 输入：target = 4, nums = [1,4,4]
     * 输出：1
     */
    public static int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int l = 0, r = 0, cur_sum = 0;
        while(r < nums.length){
            // 1. r 向右移动
            cur_sum += nums[r];
            // 2.满足条件了，l向右移动
            while(l < r && cur_sum - nums[l] >= target){
                cur_sum -= nums[l];
                l++;
            }
            // l 还是需要想右走一步，然后重复吧
            if(cur_sum >= target){
                if(r - l + 1 < res){
                    res = r - l + 1;
                }
                cur_sum -= nums[l];
                l++;
            }
            r++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }

    public static void main(String[] args) {
        int res = minSubArrayLen(7, new int[] {2,3,1,2,4,3});
        System.out.println(res);
    }
}
