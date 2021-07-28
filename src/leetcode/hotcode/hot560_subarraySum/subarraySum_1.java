package leetcode.hotcode.hot560_subarraySum;

import java.util.HashMap;
import java.util.Map;

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
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> preSumFreq = new HashMap<>();
        preSumFreq.put(0, 1);

        int preSum = 0;
        int count = 0;
        for(int num : nums){
            preSum += num;
            //
            if(preSumFreq.containsKey(preSum - k)){
                count += preSumFreq.get(preSum - k);
            }
            preSumFreq.put(preSum, preSumFreq.getOrDefault(preSum,0) + 1);
        }
        return count;
    }
}
/**
 * 时间复杂度：O(N)O(N)，这里 NN 是数组的长度；
 * 空间复杂度：O(N)O(N)。
 */
