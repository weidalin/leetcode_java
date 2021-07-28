package written_examination.intern.wangyi0508.wy4_GetMaxCoverage;

import static leetcode.labuladong.binarytree.binarytree538_convertBST.convertBST_1.sum;

public class Main {
    static int res;
    static int[] nums;
    static int dis;
    public static int GetMaxCoverage(int[] populationDistribute, int stationCoverage) {
        // write code here
        res = 0;
        nums = populationDistribute;
        dis = stationCoverage;
        dfs(stationCoverage, stationCoverage * 3 , stationCoverage * 5, stationCoverage * 7);
        return res;
    }

    private static void dfs(int i, int i1, int i2, int i3) {
        if(i3 + dis >= nums.length || i1 - i < 2 * dis || i2 - i1 < 2 * dis || i3 - i2 < 2 * dis){
            return ;
        }
        int sum = count(nums, i, i1, i2, i3);
        res = Math.max(sum, res);
        dfs(i + 1, i1, i2, i3);
        dfs(i , i1+ 1, i2, i3);
        dfs(i , i1, i2 + 1, i3);
        dfs(i , i1, i2 + 1, i3+ 1);

    }

    private static int count(int[] nums, int i, int i1, int i2, int i3) {
        return sum(i) + sum(i1) + sum(i2) + sum(i3);
    }

    private static int sum(int idx) {
        int sum = 0;
        for(int i = idx - dis; i <= idx + dis; i++){
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        int res = GetMaxCoverage(nums, 1);
        System.out.println(res);
    }
}
