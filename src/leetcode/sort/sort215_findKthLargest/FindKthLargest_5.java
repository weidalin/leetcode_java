package leetcode.sort.sort215_findKthLargest;

import java.util.PriorityQueue;

/**
 * 215. 数组中的第K个最大元素
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 * 示例 1:
 *
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * 示例 2:
 *
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 */
public class FindKthLargest_5 {
    public static int findKthLargest(int[] nums, int k) {
        //堆，时间复杂度O(NlogK) 空间O(K)
        PriorityQueue<Integer> pq = new PriorityQueue<>();//小顶堆
        //大顶堆
//        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });

        for (int num : nums){
            pq.add(num);
            if(pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }
}
/**
 * 执行用时：
 * 5 ms
 * , 在所有 Java 提交中击败了
 * 54.23%
 * 的用户
 * 内存消耗：
 * 38.8 MB
 * , 在所有 Java 提交中击败了
 * 51.71%
 * 的用户
 */
