package leetcode.sort.sort215_findKthLargest;

import java.util.Arrays;

import static tools.Weida_utils.swap;

public class SelectSort {
    public static void main(String[] args){
        int[] arr = new int[] {9,4,6,8,3,10,4,6};
        selectSort(arr);
        System.out.println("slectsort："+Arrays.toString(arr));
    }

    private static void selectSort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int min = Integer.MAX_VALUE;
            int min_index = -1;
            for(int j = i; j < n; j++){
                if(nums[j] < min){
                    min = nums[j];
                    min_index = j;
                }
            }
            swap(nums, i, min_index);
        }
    }
}
/**
 *时间复杂度：O(N2)
 * 空间复杂度：O(1)
 */