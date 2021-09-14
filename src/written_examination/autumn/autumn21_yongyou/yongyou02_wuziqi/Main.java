package written_examination.autumn.autumn21_yongyou.yongyou02_wuziqi;

import java.util.Arrays;

import static tools.Weida_utils.print_arr;

/**
 * @author linweida
 * 2021/9/12 9:58 上午
 */

// 判断数组，是否可以连成五子棋
public class Main {
    public static void main(String[] args) {
        int[] nums = {500, 300, 800, 300, 270, 570};
//        int[] res = findMountain(nums);
//        print_arr(res);
        
    }
    public boolean check (int[][] points) {

        // write code here
        Arrays.sort(points);
        int preX = points[0][0];
        int preY = points[0][1];

        int nextX = points[1][0];
        int nextY = points[1][1];
        int xielv = (nextY-preY) / (nextX-preX);

        for(int i = 1; i < points.length - 1; i++){
            preX = points[i][0];
            preY = points[i][1];

            nextX = points[i+1][0];
            nextY = points[i+1][1];
            continue;
//
//            if((nextY-preY) / (nextX-preX) == xielv){
//                continue;
//            }else{
//                return false;
//            }
        }
        return true;
    }
}
