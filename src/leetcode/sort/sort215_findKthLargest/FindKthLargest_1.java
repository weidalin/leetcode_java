package leetcode.sort.sort215_findKthLargest;

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
public class FindKthLargest_1 {
    static Random random = new Random();
    public static int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length-1, nums.length-k);

    }

    private static int quickSelect(int[] nums, int left, int right, int index) {
        int q = randomPartition(nums, left, right);
        if(q == index){
            return nums[q];
        }else if (q < index){
            left = q + 1;
        }else{
            right = q -1;
        }
        return quickSelect(nums, left, right, index);
    }

    private static int randomPartition(int[] nums, int left, int right) {
//        int i = random.nextInt(right - left + 1) + left;
//        swap(nums, i, right);
        return partition_2(nums, left, right);
    }

    public static int partition_1(int[] nums, int left, int right){
        int p = nums[right], j = left - 1;
        for(int i = left; i < right; i++){
            if (nums[i] <= p){
                swap(nums, ++j, i);
            }
        }
        swap(nums, j+1, right);
        return j + 1;
    }

    private static int partition_2(int[] nums, int left, int right) {
        int p = nums[left];
        int j = left;
        for(int i = left + 1; i <= right; i++){
            if (nums[i] < p){
                j++;
                swap(nums, i, j);
            }
        }
        swap(nums, j, left);
        return j;
    }
}
