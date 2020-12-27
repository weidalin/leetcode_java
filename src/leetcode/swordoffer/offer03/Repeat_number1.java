package src.leetcode.swordoffer.offer03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
找出数组中重复的数字。


在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

示例 1：

输入：
[2, 3, 1, 0, 2, 5, 3]
输出：2 或 3

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Repeat_number1 {
    /**
     * 执行结果：
     * 通过
     * 显示详情
     * 执行用时：
     * 8 ms
     * , 在所有 Java 提交中击败了
     * 28.29%
     * 的用户
     * 内存消耗：
     * 47.1 MB
     * , 在所有 Java 提交中击败了
     * 41.18%
     * 的用户
     * @param nums
     * @return
     */
    public static int findRepeatNumber(int[] nums) {
        Set<Integer> hashset = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(hashset.contains(nums[i]))
                    return nums[i];
            hashset.add(nums[i]);
        }
        return -1;
    }

}
