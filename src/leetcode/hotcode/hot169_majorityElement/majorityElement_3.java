package leetcode.hotcode.hot169_majorityElement;

import java.util.Arrays;

/*

给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。



示例 1：

输入：[3,2,3]
输出：3
 */
public class majorityElement_3 {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
/**
 执行用时：
 2 ms
 , 在所有 Java 提交中击败了
 74.68%
 的用户
 内存消耗：
 41.5 MB
 , 在所有 Java 提交中击败了
 91.70%
 的用户*/