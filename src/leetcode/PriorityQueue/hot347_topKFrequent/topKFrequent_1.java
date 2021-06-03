package leetcode.PriorityQueue.hot347_topKFrequent;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * 347. 前 K 个高频元素
 * 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。
 *
 * 示例 1:
 *
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 示例 2:
 *
 * 输入: nums = [1], k = 1
 * 输出: [1]
 */
public class topKFrequent_1 {
    public int[] topKFrequent(int[] nums, int k) {
        //使用字典，统计每个元素出现的次数，元素为键，元素出现的次数为值
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //遍历map,用最小堆保存频率最大的k个元素
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a) - map.get(b);
            }
        });
        for(Integer key : map.keySet()){
            if(pq.size() < k){
                pq.add(key);
            }else if(map.get(key) > map.get(pq.peek())){
                pq.remove();
                pq.add(key);
            }
        }
        //取出最小堆中的元素

//        List<Integer> res = new ArrayList<>();
//        while(!pq.isEmpty()){
//            res.add(pq.remove());
//        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = pq.remove();
        }
        return res;
    }
}
