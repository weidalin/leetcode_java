//package leetcode.hotcode.hot34_searchRange;
//
///**
// * 34. 在排序数组中查找元素的第一个和最后一个位置
// * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
// *
// * 如果数组中不存在目标值 target，返回 [-1, -1]。
// *
// * 进阶：
// *
// * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
// *
// *
// * 示例 1：
// *
// * 输入：nums = [5,7,7,8,8,10], target = 8
// * 输出：[3,4]
// */
//public class searchRange_2 {
//    public int[] searchRange(int[] nums, int target) {
//        int left = 0, right = nums.length - 1;
//        int i = -1, j = -1;
//        int appear = -1;
//        while(left <= right){
//            int mid = (left + right) / 2;
//            if(mid - 1 > 0){
//                if(nums[mid] == target ){
//                    if(mid - 1 > 0 && nums[mid - 1] != target){
//                        i = mid;
//                        break;
//                    }else if(){
//
//                    }
//                }else if(nums[mid] > target){
//                    right = mid - 1;
//                }else{
//                    left = mid + 1;
//                }
//            }
//
//        }
//
//    }
//}
