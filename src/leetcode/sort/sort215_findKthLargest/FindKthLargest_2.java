package leetcode.sort.sort215_findKthLargest;

import static tools.Weida_utils.swap;

/**
 * 215. 数组中的第K个最大元素
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 * 示例 1:
 *
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * 示例 2:
 *
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 */
public class FindKthLargest_2 {
    public static int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int left = 0;
        int right = len-1;
        int target = len-k;
        while(true){
            int index = partition(nums, left, right);
            if(index == target){
                return nums[index];
            }else if(index < target){
                left = index + 1;
            }else{
                right = index - 1;
            }
        }
    }

    private static int partition(int[] nums, int left, int right) {
        int p = nums[left];
        int j = left;
        for(int i = left + 1; i <= right; i++){
            if(nums[i] < p){
                j++;
                swap(nums, i, j);
            }
        }
        swap(nums, j, left);
        return j;
    }
}
/**
 * ：
 * 超出时间限制
 */
