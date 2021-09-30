package written_examination.autumn.autumn35_baidu.baidu02;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/28 8:02 下午
 */
// 20
public class Main2 {
    static int res;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tt = 0; tt < t; tt++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
                nums[i] %= 10e9 + 7;
            }
            res = 0;
            func(nums, k);
            System.out.println(res);
        }
    }

    private static void func(int[] nums, int k) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        dfs(0, 0, 0, nums, k);
    }

    private static void dfs(int idx, int curNum, int sum, int[] nums, int k) {
        // 0 退出
        if(sum % 2 == 0 && curNum == k){
            res ++;
            return;
        }
        if(idx == nums.length)  return;

        // 1. 选择
        dfs(idx + 1, curNum + 1, sum + nums[idx], nums, k);
        // 2.不选择
        dfs(idx + 1, curNum, sum, nums, k);
    }
}
/*

3
5 2
1 2 3 4 5
3 1
1 2 3
4 3
1 4 2 2

1
5 2
1 2 3 4 5
 */