package leetcode.swordoffer.offer39_majorityElement;

import java.util.HashMap;

public class MajorityElement_1 {
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
        //投票
        int vote = 0, x = 0;
        for(int num : nums){
            if(vote == 0){
                x = num;
            }else{
                vote = num == x ? vote + 1 : vote -1;
            }
        }
        int count = 0;
        for(int num : nums){
            if(x == num){
                count ++;
            }
        }
        x = count >= nums.length / 2 ? x : 0;
        return x;
    }
}
/**
 * 执行用时：
 * 1 ms
 * , 在所有 Java 提交中击败了
 * 99.96%
 * 的用户
 * 内存消耗：
 * 42 MB
 * , 在所有 Java 提交中击败了
 * 30.21%
 * 的用户
 */
