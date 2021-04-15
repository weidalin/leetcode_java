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
public class TwoSum_3 {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            int j = find(nums, i, target - nums[i]);
            if(j != -1){
                return new int[]{nums[i], nums[j]};
            }
        }
        return new int[]{0,0};
    }

    private static int find(int[] nums, int i, int target) {
        int low = i + 1;
        int high = nums.length -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
/**
 * 执行用时：
 * 45 ms
 * , 在所有 Java 提交中击败了
 * 20.54%
 * 的用户
 * 内存消耗：
 * 55.3 MB
 * , 在所有 Java 提交中击败了
 * 73.03%
 * 的用户
 */

