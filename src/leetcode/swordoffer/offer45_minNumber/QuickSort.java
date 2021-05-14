package leetcode.swordoffer.offer45_minNumber;

import static tools.Weida_utils.print_arr;
import static tools.Weida_utils.swap;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,10,8,7,55};
        quickSort(nums, 0, nums.length-1);
        print_arr(nums);
    }

    private static void quickSort(int[] nums, int left, int right) {
        if(left >= right)
            return;
        int piov = nums[left];
        int i = left, j = right;
        while(i < j){
            while(nums[j] >= piov && i < j){
                j--;
            }
            while(nums[i] <= piov && i < j){
                i++;
            }
            swap(nums, i , j);
        }
        nums[left] = nums[j];
        nums[j] = piov;
        quickSort(nums, left, j-1);
        quickSort(nums, j+1, right);
    }
}
