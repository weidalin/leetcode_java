package leetcode.hotcode.hot33_search;

/**
 * 33. 搜索旋转排序数组
 * 整数数组 nums 按升序排列，数组中的值 互不相同 。
 *
 * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
 *
 * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
 *
 * 示例 1：
 *
 * 输入：nums = [4,5,6,7,0,1,2], target = 0
 * 输出：4
 * 提示：
 *
 * 1 <= nums.length <= 5000
 * -10^4 <= nums[i] <= 10^4
 * nums 中的每个值都 独一无二
 * 题目数据保证 nums 在预先未知的某个下标上进行了旋转
 * -10^4 <= target <= 10^4
 *  
 *
 * 进阶：你可以设计一个时间复杂度为 O(log n) 的解决方案吗？
 */
public class search_1 {
    public static int search(int[] nums, int target) {
        int len = nums.length;
        if(len == 0)    return -1;
        int left = 0, right = len - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
            }
            // 2.左边有序
            // 虽然这里不会出现数组里两个数是相等，但下标left和mid可能相等！！！
            else if(nums[left] <= nums[mid]){
                // 2.1 target在左边
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }
                // 2.2 target 在右边
                else{
                    left = mid + 1;
                }
            // 1. 右边有序
            }else{
                // 1.1 target在右边
                if(target > nums[mid] && nums[right] >= target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }

            }

            // 2.右边有序
            // 那为什么这里不加=？？？？我很疑惑
//            if(nums[mid] < nums[right]){
//                // 1.1 target在右边
//                if(target > nums[mid] && nums[right] >= target){
//                    left = mid + 1;
//                }else{
//                    right = mid - 1;
//                }
//            }
//            else{
//                // 2.1 target在左边
//                if(target >= nums[left] && target < nums[mid]){
//                    right = mid - 1;
//                }
//                // 2.2 target 在右边
//                else{
//                    left = mid + 1;
//                }
//
//            }

        }
        return -1;
    }
}
