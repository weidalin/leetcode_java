package leetcode.dfs.wangyi02_;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/10 4:58 下午
 */

public class MainDfs {
    static int k;
    static int res;
    public static void main(String[] args) {
        res = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String input = "11100011110 2";
        String input = "0011001110110001111 3";

        String[] inputs = input.split(" ");
        String[] strs = inputs[0].split("");
        k = Integer.parseInt(inputs[1]);

        int[] nums = new int[strs.length];
        for(int i = 0; i < strs.length; i++){
            nums[i] = Integer.parseInt(strs[i]);
        }

        dfs(nums, 0, k);

        System.out.println(res);
    }

    private static void dfs(int[] nums, int i, int k) {
        if(k < 0){
            return;
        }
        if(i == nums.length){
//            print_arr(nums);
//            System.out.println( "\t" + k);
            int cur = getMax(nums);
            res = Math.max(res, cur);
            return;
        }
        if(nums[i] == 1){
            dfs(nums, i + 1, k);
        }
        else {
            dfs(nums, i + 1, k);
            nums[i] = 1;
            dfs(nums, i + 1, k-1);
            nums[i] = 0;
        }
    }

    private static int getMax(int[] nums) {
        int res = 0;
        int cur = 0;
        for(int num : nums){
            if(num == 0){
                res = Math.max(res, cur);
                cur = 0;
            }else{
                cur++;
            }
        }
        return res;
    }

}
/*
11100011110 2
6

0011001110110001111 3
10

 */