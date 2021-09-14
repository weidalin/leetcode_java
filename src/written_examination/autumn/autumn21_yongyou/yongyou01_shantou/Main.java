package written_examination.autumn.autumn21_yongyou.yongyou01_shantou;

import java.util.Scanner;

import static tools.Weida_utils.print_arr;

/**
 * @author linweida
 * 2021/9/12 19:58
 */
// 计算可以看到的山头
// AC
public class Main {
    public static void main(String[] args) {
        int[] nums = {500, 300, 800, 300, 270, 570};
        int[] res = findMountain(nums);
        print_arr(res);
        
    }
    public static int[] findMountain (int[] heights) {
        // write code here
        int n = heights.length;
        int[] res = new int[n];

        for(int i = 0; i < n; i++){
            int curSee = 1;
            // 向左看
            if(i >= 1) {
                int leftTop = heights[i - 1];
                for (int j = i - 1; j >= 0; j--) {
                    if(heights[j] < leftTop)    continue;
                    if (heights[j] > heights[i])    curSee++;
                    if (heights[j] <= heights[i]) curSee++;
                    if (heights[j] > leftTop) leftTop = heights[j];
                }
            }
            // 向右看
            if(i <= n - 2) {
                int rightTop = heights[i + 1];
                for (int j = i + 1; j < n; j++) {
                    if(heights[j] < rightTop)    continue;
                    if (heights[j] > heights[i]) curSee++;
                    if (heights[j] < heights[i]) curSee++;
                    if (heights[j] > rightTop) rightTop = heights[j];
                }
            }
            res[i] = curSee;
        }
        return res;
    }

}
// [3,3,5,4,4,4]
