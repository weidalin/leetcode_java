package leetcode.swordoffer.offer61_isStraight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 剑指 Offer 61. 扑克牌中的顺子
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 *
 *
 *
 * 示例 1:
 *
 * 输入: [1,2,3,4,5]
 * 输出: True
 *
 *
 * 示例 2:
 *
 * 输入: [0,0,1,2,5]
 * 输出: True
 */
public class isStraight_1 {
    public static boolean isStraight(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = 14, max = -1;

        for(int num : nums){
            if(num == 0){
                continue;
            }
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
            if(set.contains(num))
                return false;
            else{
                set.add(num);
            }
        }
        return max - min < 5;
    }
}
/**
 * 执行用时：
 * 1 ms
 * , 在所有 Java 提交中击败了
 * 91.84%
 * 的用户
 * 内存消耗：
 * 36.2 MB
 * , 在所有 Java 提交中击败了
 * 5.42%
 * 的用户
 */
