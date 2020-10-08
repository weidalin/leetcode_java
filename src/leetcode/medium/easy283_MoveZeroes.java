package leetcode.medium;

import tools.Weida_utils;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */

public class easy283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int insertPos=0;
        for (int num: nums){
            if (num != 0)   nums[insertPos++] = num;
        }
        while (insertPos < nums.length)
            nums[insertPos++]=0;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        new easy283_MoveZeroes().moveZeroes(nums);
        Weida_utils.print_arr(nums);
    }
}
