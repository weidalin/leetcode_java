package leetcode.sort.sort215_findKthLargest;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

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
public class FindKthLargest_3 {
    public static int findKthLargest(int[] nums, int k) {
        //选择排序
        int left = 0;
        int right = nums.length - 1;
        int target = nums.length - k;
        while(true){
            int p_index = partition(nums, left, right);
            if (target == p_index) {
                return nums[p_index];
            }else if(target > p_index){
                left = p_index + 1;
            }else{
                right = p_index - 1;
            }
        }
    }

    private static int partition(int[] nums, int left, int right) {
        int j = left;
        int p = nums[left];
        for(int i = left + 1; i <= right; i++){
            if (nums[i] < p){ //把所有小于p的数都放在j的位置上！
                j++;
                swap(nums, i, j);
            }
        }
        swap(nums, left, j);
        return j;
    }
}
