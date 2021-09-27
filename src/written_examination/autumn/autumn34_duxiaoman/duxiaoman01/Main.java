package written_examination.autumn.autumn34_duxiaoman.duxiaoman01;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/26 3:37 下午
 */

public class Main {
    static int res ;
    public static void main(String[] args) {
        res = 0;
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();
        String[][] nums = new String[N + M][2];
        for(int i = 0; i < nums.length; i++){
            String str = sc.nextLine();
            String[] strs = str.split("-");
            nums[i][0] = strs[0];
            nums[i][1] = strs[1];
        }
        Arrays.sort(nums,(o1, o2)->o1[0].compareTo(o2[0]));
        dfs(0, 0, "00:00", nums);
        System.out.println(res);
    }

    private static void dfs(int i, int tmp, String pre, String[][] times) {
        if(i == times.length){
            if(tmp > res)   res = tmp;
            return;
        }
        String[] time = times[i];
        if(time[0].compareTo(pre) >= 0) {
            tmp ++;
            dfs(i+1, tmp, time[1], times);
            tmp--;
        }
        dfs(i + 1, tmp, pre, times);
    }
}
/*
3 4
08:00-09:00
09:30-11:00
13:00-15:00
07:00-08:00
08:00-11:00
12:00-13:30
14:00-17:00
 */
