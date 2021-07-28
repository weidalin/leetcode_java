package leetcode.hotcode.hot42_trap;

/**
 * 42. 接雨水
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * 示例 1：
 *
 * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出：6
 * 解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
 * 示例 2：
 *
 * 输入：height = [4,2,0,3,2,5]
 * 输出：9
 */
public class trap_1 {
    public static int trap(int[] height) {
        int sum = 0;
        for(int h : height){
            sum += h;
        }
        int volumn = 0;
        int heigh = 1;
        int l = 0, r = height.length - 1;
        while(l <= r){
            while(l < height.length && height[l] < heigh){
                l ++;
            }
            while(r > 0 && height[r] < heigh){
                r --;
            }
            volumn += r - l + 1;
            heigh++;
        }
        return volumn - sum;
    }
}
