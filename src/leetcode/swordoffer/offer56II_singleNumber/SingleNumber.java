package leetcode.swordoffer.offer56II_singleNumber;

import java.util.HashMap;

/**
 * 剑指 Offer 56 - II. 数组中数字出现的次数 II
 * 在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [3,4,3,3]
 * 输出：4
 * 示例 2：
 *
 * 输入：nums = [9,1,7,9,7,9,7]
 * 输出：1
 *
 *
 * 限制：
 *
 * 1 <= nums.length <= 10000
 * 1 <= nums[i] < 2^31
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key: map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;

    }
}
/**
 * 执行用时：
 * 22 ms
 * , 在所有 Java 提交中击败了
 * 6.07%
 * 的用户
 * 内存消耗：
 * 39.5 MB
 * , 在所有 Java 提交中击败了
 * 39.97%
 * 的用户
 */
