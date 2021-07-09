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
public class findUnsortedSubarray_2 {
    public static int findUnsortedSubarray(int[] nums) {
//        int[] snums = nums.clone();
        int[] nums_copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums_copy);
        int left = 0, right = nums.length - 1;
        while(left <= right && nums[left] == nums_copy[left]){
            left ++;
        }
        while(right > left && nums[right] == nums_copy[right]){
            right--;
        }
        return right - left + 1;
    }
}
