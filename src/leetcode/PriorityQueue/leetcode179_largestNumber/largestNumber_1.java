package leetcode.PriorityQueue.leetcode179_largestNumber;

/**
 * @author linweida
 * 2021/8/6 8:29 下午
 */

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 179. 最大数
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 *
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 *
 * 示例 1：
 *
 * 输入：nums = [10,2]
 * 输出："210"
 * 示例 2：
 *
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 * 示例 3：
 *
 * 输入：nums = [1]
 * 输出："1"
 */


public class largestNumber_1 {
    public static String largestNumber(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                String xy = x+"" + y+"";
                String yx = y+"" + x+"";
                return yx.compareTo(xy);
            }
        });

        for(int num : nums){
            pq.add(num);
        }
        if(!pq.isEmpty() && pq.peek() == 0)  return "0";
        StringBuffer sb = new StringBuffer();
        while(pq.size() > 0){
            System.out.println(pq.peek());
            sb.append(pq.poll());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        String res = largestNumber(nums);
        System.out.println(res);
    }
}
