package leetcode.swordoffer.offer39_majorityElement;

import java.util.HashMap;

public class MajorityElement_2 {
    /**
     * 剑指 Offer 39. 数组中出现次数超过一半的数字
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     *
     *
     *
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     *
     *
     *
     * 示例 1:
     *
     * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
     * 输出: 2
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        HashMap<Integer,  Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = -1;
        Integer res = null;
        for(int key : map.keySet()){
            if(map.get(key) > count){
                res = key;
                count = map.get(key);
            }
        }
        return res;
    }
} /**
 执行用时：
 13 ms
 , 在所有 Java 提交中击败了
 26.99%
 的用户
 内存消耗：
 43.8 MB
 , 在所有 Java 提交中击败了
 11.70%
 的用户*/
