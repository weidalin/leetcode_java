package leetcode.hotcode.hot34_searchRange;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 进阶：
 *
 * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
 *
 *
 * 示例 1：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 */
public class searchRange_1 {
    public static int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int i = -1, j = -1;
        int appear = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target && mid - 1 > 0 && nums[mid - 1] != target
                    || nums[mid] == target && mid - 1 < 0 ){
                i = mid;
                break;
            }else if(nums[mid] == target){
                i = mid;
                right = mid - 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        left = 0;
        right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target && mid + 1 < nums.length && nums[mid + 1] != target
                    || nums[mid] == target && mid + 1 >= nums.length  ){
                j = mid;
                break;
            }else if(nums[mid] == target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
//        if(i == -1 && j != -1){
//            i = j;
//        }else if(i != -1 && j == -1){
//            j = i;
//        }
        return new int[]{i, j};
    }
}
