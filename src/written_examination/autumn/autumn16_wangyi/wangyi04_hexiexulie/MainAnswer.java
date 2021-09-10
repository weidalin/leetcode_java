package written_examination.autumn.autumn16_wangyi.wangyi04_hexiexulie;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/10 12:56 下午
 */

//
public class MainAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        int[] nums = new int[strs.length];
        for(int i = 0; i < strs.length; i++){
            nums[i] = Integer.parseInt(strs[i]);
        }
        int res = 0;
        for(int i = 0 ; i < strs.length; i++){
            for(int j = i + 1; j <= strs.length; j++){
                if(judge(nums, i, j)){
                    res = Math.max(res, j - i);
                }
            }
        }
        System.out.println(res);
    }

    private static boolean judge(int[] nums, int i, int j) {
        int min = nums[i];
        int max = nums[i];
        for(int k = i+1; k < j; k++){
            if(Math.abs(nums[k] - min) > 1){
                return false;
            }
            if(nums[k] < min){
                min = nums[k];
            }
            if(nums[k] > max){
                max = nums[k];
            }
        }
        return max - min == 1;
    }
}
/*
1 3 2 2 1 1 2 3
6

2
0
 */