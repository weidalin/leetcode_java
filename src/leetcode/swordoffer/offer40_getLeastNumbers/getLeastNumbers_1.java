package leetcode.swordoffer.offer40_getLeastNumbers;

import java.util.Arrays;

import static tools.Weida_utils.print_arr;
import static tools.Weida_utils.swap;

/**
 * 剑指 Offer 40. 最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 *
 *
 *
 * 示例 1：
 *
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * 示例 2：
 *
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 *
 */class Solution {
    public static int[] getLeastNumbers(int[] arr, int k) {
        if(k == 0 || arr.length == 0){
            return new int[0];
        }
        return quickSearch(arr, 0, arr.length - 1, k-1);
    }

    private static int[] quickSearch(int[] nums, int left, int right, int k) {
        int j = partition(nums, left, right);
        if (j == k){
            return Arrays.copyOf(nums, j + 1);
        }
        if(j > k){
            return quickSearch(nums, left, j - 1, k);
        }else{
            return quickSearch(nums,j + 1, right, k);
        }
    }

    private static int partition(int[] nums, int left, int right) {
        int pivo = nums[left];
        int i = left, j = right;
        while(i < j){
            while(nums[j] >= pivo && i < j){
                j--;
            }
            while(nums[i] <= pivo && i < j){
                i++;
            }
            swap(nums, i, j);
        }
        nums[left] = nums[j];
        nums[j] = pivo;
        return j;
    }

    public static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
