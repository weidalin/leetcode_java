package leetcode.hotcode.hot560_subarraySum;

/**
 * 560. 和为K的子数组
 * 给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。
 *
 * 示例 1 :
 *
 * 输入:nums = [1,1,1], k = 2
 * 输出: 2 , [1,1] 与 [1,1] 为两种不同的情况。
 */
public class subarraySum_2 {
    public static int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int[] sum = new int[len];
        int cur_sum = 0;
        int res = 0;

        for(int i = 0; i < len; i++){
            cur_sum += nums[i];
            sum[i] = cur_sum;
            if(cur_sum==k)
                res++;
        }
        for(int i = 1; i < len; i++){
            for(int j = 0; j < i; j++){
                if(sum[i] - sum[j] == k){
                    res++;
                }
            }
        }
        return res;
    }
}
/**
 * 时间复杂度：O(N^2)O(N
 * 2
 *  )，这里 NN 是数组的长度；
 * 空间复杂度：O(N)O(N)。
 */
