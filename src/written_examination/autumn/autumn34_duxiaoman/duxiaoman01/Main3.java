package written_examination.autumn.autumn34_duxiaoman.duxiaoman01;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/26 3:37 下午
 */

public class Main3 {
    public static void main(String[] args) {
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
        int res = meetingRoom(nums);
        System.out.println(res);
    }

    private static int meetingRoom(String[][] times) {
        String pre = "00:00";
        int tmp = 0;
        for(String[] time : times){
            if(time[0].compareTo(pre) >= 0){
                tmp++;
                pre = time[1];
            }
        }
        return tmp;
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
