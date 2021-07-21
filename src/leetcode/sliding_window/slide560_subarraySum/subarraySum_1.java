package leetcode.sliding_window.slide560_subarraySum;
/**
 * 560. 和为K的子数组
 * 给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。
 *
 * 示例 1 :
 *
 * 输入:nums = [1,1,1], k = 2
 * 输出: 2 , [1,1] 与 [1,1] 为两种不同的情况。
 */
public class subarraySum_1 {
    /**
     * 这道题好像不适合使用滑动窗口，因为数组元素不是正整数
     * @param nums
     * @param k
     * @return
     */
    public static int subarraySum(int[] nums, int k) {
        int res = 0;
        int l = 0, r = 0, cur_sum = 0;
        while(r < nums.length){
            // 1. r 向右移动
            cur_sum += nums[r];
            // 2.满足条件了，l向右移动
            if(cur_sum != k){
                if(l < r && cur_sum - nums[l] != k){
                    cur_sum -= nums[l];
                    l++;
                }
                if(cur_sum == k){
                    res ++;
                }
                // l 还是需要想右走一步，然后重复吧
                cur_sum -= nums[l];
                l++;
            }else if(cur_sum == k){
                res ++;
            }
            r++;
        }
        return res;
    }

    public static void main(String[] args) {
        int res = subarraySum(new int[]{-1,-1,1}, 0);
        System.out.println(res);
    }
}
