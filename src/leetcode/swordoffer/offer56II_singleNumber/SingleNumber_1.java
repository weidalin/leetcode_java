package leetcode.swordoffer.offer56II_singleNumber;

import java.util.HashMap;

import static tools.Weida_utils.print_arr;

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
public class SingleNumber_1 {
    public static int singleNumber(int[] nums) {
        int[] count = new int[32];
        //1. 计算
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < 32; j++){
                count[31-j] += nums[i] & 1;
                nums[i] >>>= 1;
            }
        }
        //2. 统计
        for(int i = 0; i < 32; i++){
            count[i] %= 3;
        }
        print_arr(count);
        System.out.println();
        //3. 还原
        int res = 0;
        for(int i = 0; i < 32; i++){
            res <<= 1 ;
            res |= count[i];
        }
        return res;


    }
}
/**
 执行用时：
 9 ms
 , 在所有 Java 提交中击败了
 54.71%
 的用户
 内存消耗：
 39.6 MB
 , 在所有 Java 提交中击败了
 29.96%
 的用户
 */
