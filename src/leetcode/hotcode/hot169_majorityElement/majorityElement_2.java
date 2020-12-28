package leetcode.hotcode.hot169_majorityElement;

import java.util.HashMap;

/*

给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。



示例 1：

输入：[3,2,3]
输出：3
 */
public class majorityElement_2 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int num : nums){
            int val = map.get(num) == null ? 1: map.get(num)+1;
            map.put(num, val);
            if (map.get(num) >= nums.length / 2)
                return num;
        }
        return -1;
    }
}
/**
 * 执行用时：
 * 26 ms
 * , 在所有 Java 提交中击败了
 * 5.84%
 * 的用户
 * 内存消耗：
 * 43.3 MB
 * , 在所有 Java 提交中击败了
 * 32.60%
 * 的用户
 */
