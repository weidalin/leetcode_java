package leetcode.swordoffer.offer40_getLeastNumbers;

import static leetcode.swordoffer.offer40_getLeastNumbers.Solution.swap;
import static tools.Weida_utils.print_arr;

//1.排序
public class QuickSort {
    public static void main(String[] args){
        int[] nums = new int[]{2,34,45,5,5231,12,34,21};
        partition(nums, 0, nums.length - 1);
        print_arr(nums);

    }

    private static void partition(int[] nums, int left, int right) {
        if(left > right) return;

        int poiv = nums[left];
        int i = left, j = right;
        while(i < j){
            while(nums[j] >= poiv && i < j){
                j--;
            }while(nums[i] <= poiv && i < j){
                i ++;
            }
            swap(nums, i, j);
        }
        nums[left] = nums[i];
        nums[i] = poiv;
        partition(nums, left, j -1);
        partition(nums, j + 1, right);
    }
}
