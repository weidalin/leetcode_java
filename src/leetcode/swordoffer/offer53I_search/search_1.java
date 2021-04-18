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
public class search_1 {
    public static int search(int[] nums, int target) {
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == target){
                count ++;
            }else{
                break;
            }
        }
        return count;
    }

//    private static int bin_search(int[] nums, int target, int i, int j) {
//        if(i > j){
//            return -1;
//        }
//        int mid = (i + j) / 2;
//        if(nums[mid] == target){
//            return mid;
//        }else if(nums[mid] > target){//去左边找
//            return bin_search(nums,  target, i,mid - 1);
//        }else{
//            return bin_search(nums, target, mid + 1, j);
//        }
//    }
}
