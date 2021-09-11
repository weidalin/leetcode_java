package leetcode.dfs.wangyi02_;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/10 4:58 下午
 */

public class MainSliwindow {
    static int maxArea;
    static int maxArea_;
    static int maxArea_Index;
    static int maxAreaIndex;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String input = "11100011110 2";
        String input = "0011001110110001111 3";

        String[] inputs = input.split(" ");
        String[] strs = inputs[0].split("");
        int K = Integer.parseInt(inputs[1]);

        int[] nums = new int[strs.length];
        for(int i = 0; i < strs.length; i++){
            nums[i] = Integer.parseInt(strs[i]);
        }

        int res = fillNumMax(nums, K);

        System.out.println(res);
    }

    private static int fillNumMax(int[] nums, int k) {
        // 滑动窗口
        int i = 0, j = 0;
        int res = -1;
        Deque<Integer> deque = new LinkedList<>();
        while(j < nums.length){
            if(k < 0){ // 否则 复位原来的0
                    int preJ = deque.pollFirst();
                    nums[preJ] = 0;
                    k++;
            }else { // k > 0 继续0->1
                if (nums[j] == 0) {
                    nums[j] = 1;
                    k--;
                    deque.add(j);
                }
            }
            j++;
            if(k >= 0) {
                int curRes = getMax(nums);
//                print_arr(nums);
//                System.out.println("\t" + k + "\t" + curRes);
                res = Math.max(curRes, res);
            }
        }
        return res;
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