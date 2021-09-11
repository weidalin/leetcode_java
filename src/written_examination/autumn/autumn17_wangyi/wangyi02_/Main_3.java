package written_examination.autumn.autumn17_wangyi.wangyi02_;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/10 4:58 下午
 */

public class Main_3 {
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

        boolean[] chossed = new boolean[nums.length];
        dfs(nums, 0, 0, K, indexAndArea, chossed);

        System.out.println("\n" + maxArea);

    }

    private static void dfs(int[] nums, int i, int cur, int k,
                            Map<Integer, Integer> indexAndArea, boolean[] chossed) {
        if(i == nums.length){
            maxArea = Math.max(maxArea, cur);
            return;
        }

        if(chossed[nums[i]] == false){
            // 不选择他
            dfs(nums, i + 1, 0, k, indexAndArea, chossed);

            // 选择他
            chossed[nums[i]] = true;
            if(indexAndArea.get(nums[i]) > 0){
                dfs(nums, i + 1, cur + indexAndArea.get(nums[i]), k-1, indexAndArea, chossed);
            }
            dfs(nums, i + 1, cur + 1, k-1, indexAndArea, chossed);
        }
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