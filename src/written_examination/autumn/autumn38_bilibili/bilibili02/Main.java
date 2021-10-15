package written_examination.autumn.autumn38_bilibili.bilibili02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/10/13 7:42 下午
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][2];
        HashMap<Integer, Integer> mapx = new HashMap<>();
        HashMap<Integer, Integer> mapy = new HashMap<>();
        int res = 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int numx = mapx.getOrDefault(x, 0) + 1;
            int numy = mapy.getOrDefault(y, 0) + 1;

            mapx.put(x, numx);
            mapy.put(y, numy);
            nums[i][0] = x;
            nums[i][1] = y;
            res = Math.max(res, numx);
            res = Math.max(res, numy);
        }

        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        HashMap<Integer, Integer> mapxielv = new HashMap<>();
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if((nums[i][0] - nums[j][0]) == 0 || (nums[i][1] - nums[j][1]) == 0)    continue;
                int xie = (nums[i][1] - nums[j][1]) / (nums[i][0] - nums[j][0]);
                int numxie = mapxielv.getOrDefault(xie, 1) + 1;
                mapxielv.put(xie, numxie);
                res = Math.max(res, numxie);
            }
        }


        System.out.println(res);
    }
}
/*
2
0 0
0 1

2
0 0
1 1


 */
