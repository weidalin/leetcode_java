package leetcode.swordoffer.offer57_twoSum;

/**
 * 剑指 Offer 57. 和为s的两个数字
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[2,7] 或者 [7,2]
 * 示例 2：
 *
 * 输入：nums = [10,26,30,31,47,60], target = 40
 * 输出：[10,30] 或者 [30,10]
 */
public class TwoSum_2 {
    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
        for( int i = 0; i < nums.length - 1; i++){
            sum = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(sum+nums[j] == target) {
                    return new int[]{nums[i], nums[j]};
                }else if(sum > target) {
                    break;
                }
            }
        }
        return new int[]{0,0};
    }
}
/**
 时间不通过
 */