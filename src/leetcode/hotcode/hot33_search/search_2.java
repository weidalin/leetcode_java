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
public class search_2 {
    public static int search(int[] nums, int target) {
        // 1. 2分查找法找到旋转点
        int i = 0, j = nums.length - 1;
        int mid = (i + j) / 2;
        while(nums[i] > nums[j]){
            mid = (i + j) / 2;
            if(nums[i] > nums[mid]){
                i = mid;
            }else{
                j = mid;
            }
        }

        // 1.1 判断旋转点是否为要找的数
        if(target == nums[mid]){
            return mid;
        }else if(target > nums[mid]){
            i = 0;
            j = Math.max(mid -1, 0);
        }else{
            i = mid + 1;
            j = nums.length - 1;
        }
        // 2. 在旋转点，选取一段再做一遍二分查找法
        while(i <= j){
            mid = (i + j) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return -1;
    }
}
