package leetcode.swordoffer.offer53I_search;
/**
 * 剑指 Offer 53 - I. 在排序数组中查找数字 I
 * 统计一个数字在排序数组中出现的位置。
 *
 *
 *
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 * 示例 2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 */
public class search_2 {
    public static int search(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target - 1);

    }

    private static int helper(int[] nums, int target) {
        int i = 0, j = nums.length;
        while(i < j){
            int mid = (i + j) / 2;
            if(nums[mid] <= target){
                i = mid +1;
            }else{
                j = mid - 1;
            }
        }
        return i;
    }

}
