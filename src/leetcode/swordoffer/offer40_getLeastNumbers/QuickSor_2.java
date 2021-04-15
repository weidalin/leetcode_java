package leetcode.swordoffer.offer40_getLeastNumbers;

import java.util.Arrays;

import static leetcode.swordoffer.offer40_getLeastNumbers.Solution.swap;
import static tools.Weida_utils.print_arr;

//1.找第k小的数
//2.前K个数
public class QuickSor_2 {
    public static void main(String[] args){
        int[] nums = new int[]{2,34,45,5,5231,12,35,21};
        int k = 6;
        int res = quickSort(nums, k-1, 0, nums.length - 1);
        System.out.println(res);
        print_arr(nums);
    }

    private static int quickSort(int[] nums, int k, int left, int right) {
        int j = partition(nums, left, right);
        if(j == k){
            int[] pre_k_arr = Arrays.copyOf(nums,k+1);
            System.out.print("\npre_k_arr:");
            print_arr(pre_k_arr);
            System.out.println();
            return nums[j];
        }else if(j > k){
            return quickSort(nums, k, left, j - 1);
        }else{
            return quickSort(nums, k , j+1 , right);
        }
    }

    private static int partition(int[] nums, int left, int right) {
        int poiv = nums[left];
        int i = left, j = right;
        while(i < j){
            while(nums[j] >= poiv && i < j){
                j--;
            }while(nums[i] <= poiv && i < j){
                i++;
            }
            swap(nums, i, j);
        }
        nums[left] = nums[j];
        nums[j] = poiv;
        return j;
    }


}
