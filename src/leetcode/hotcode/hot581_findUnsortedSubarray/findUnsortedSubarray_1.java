package leetcode.hotcode.hot581_findUnsortedSubarray;

import java.util.Arrays;

/**
 * 581. 最短无序连续子数组
 * 给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 *
 * 请你找出符合题意的 最短 子数组，并输出它的长度。
 *
 * 示例 1：
 *
 * 输入：nums = [2,6,4,8,10,9,15]
 * 输出：5
 * 解释：你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 * 示例 2：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：0
 * 示例 3：
 *
 * 输入：nums = [1]
 * 输出：0
 */
public class findUnsortedSubarray_1 {
    // 不懂。。。。。。。。。。。。。。。。
    public static int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, len = nums.length;
        boolean flat = false;
        for(int i = 1; i < len; i++){
            if(nums[i] < nums[i-1]){// 从前往后出现降序
                flat = true;
            }
            if(flat){
                min = Math.min(min, nums[i]);
            }
        }
        flat = false;
        for(int i = len - 2; i >= 0; i--){
            if(nums[i] > nums[i+1]){    // 从后往前出现升序
                flat = true;
            }
            if(flat){
                max = Math.max(max, nums[i]);
            }
        }
        int l ,r;
        for(l = 0; l< len; l++){
            if(nums[l] > min){
                break;
            }
        }
        for(r = len - 1; r >= 0; r--){
            if(nums[r] < max){
                break;
            }
        }
        return r-l < 0 ? 0 : r - l + 1;
    }
}
