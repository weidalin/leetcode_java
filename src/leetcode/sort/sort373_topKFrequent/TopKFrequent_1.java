package leetcode.sort.sort373_topKFrequent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequent_1 {
    /**
     * 347. 前 K 个高频元素
     * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
     *
     *
     *
     * 示例 1:
     *
     * 输入: nums = [1,1,1,2,2,3], k = 2
     * 输出: [1,2]
     * @param nums
     * @param k
     * @return
     */
    public static int[] topKFrequent(int[] nums, int k) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int num : nums){
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        List<Integer>[] buckets = new ArrayList[nums.length + 1];
//        for(int key : map.keySet()){
//            int frequency = map.get(key);
//            if (buckets[frequency] == null){
//                buckets[frequency] = new ArrayList<>();
//            }
//            buckets[frequency].add(key);
//        }
//        List<Integer> topK = new ArrayList<>();
//        for(int i = buckets.length - 1; i >= 0 && topK.size() < k; i--){
//
//        }
        return null;
    }
}
