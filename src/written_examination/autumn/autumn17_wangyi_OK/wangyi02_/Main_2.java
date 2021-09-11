package written_examination.autumn.autumn17_wangyi_OK.wangyi02_;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static tools.Weida_utils.print_arr;

/**
 * @author linweida
 * 2021/9/10 4:58 下午
 */

public class Main_2 {
    static int maxArea;
    static int maxArea_;
    static int maxArea_Index;
    static int maxAreaIndex;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
//        String input = "11100011110 2";
        String[] inputs = input.split(" ");
        String[] strs = inputs[0].split("");
        int K = Integer.parseInt(inputs[1]);

        int[] nums = new int[strs.length];
        for(int i = 0; i < strs.length; i++){
            nums[i] = Integer.parseInt(strs[i]);
        }
//        print_arr(nums);
//        System.out.println();
        int index = 2;
        maxArea = 0;
        maxArea_Index = 0;
        Map<Integer, Integer> indexAndArea = new HashMap<>();
        indexAndArea.put(0,0);
        for(int i = 0; i < strs.length; i++){
            if(nums[i] == 1){
                int area = area(nums,i, index);
                indexAndArea.put(index, area);
                index++;
                maxArea = Math.max(maxArea, area);
                maxAreaIndex = index;
            }
            if(nums[i] == 0){
                int area = area_(nums,i, index);
                indexAndArea.put(index, area);
                index++;
                maxArea_ = Math.min(maxArea_, area);
                maxArea_Index = index;
            }
        }

        if(maxArea == 0)
            System.out.println(maxArea);
        for(int i = 0; i < nums.length; i++){
            nums[i] = indexAndArea.get(nums[i]);
        }
        print_arr(nums);

//        dfs(nums, 0, 0, K);

//        if(K == maxArea_ * -1){
//            int res = Math.max(maxArea + K,
//                    indexAndArea.getOrDefault(maxArea_Index-1, 0)
//                            + indexAndArea.getOrDefault(maxArea_Index+1, 0) + maxArea_ * -1);
//            System.out.println(res);
//        }else{
//            System.out.println(maxArea + K);
//        }
        System.out.println(maxArea);

    }



    private static int area(int[] nums, int i, int index) {
        int area = 0;
        while(i < nums.length && nums[i] != 0){
            nums[i] = index;
            area++;
            i++;
        }
        return area;
    }

    private static int area_(int[] nums, int i, int index) {
        int area = 0;
        while(i < nums.length && nums[i] == 0){
            nums[i] = index;
            area--;
            i++;
        }
        return area;
    }
}
/*
11100011110 2
6

0011001110110001111 3
10

 */