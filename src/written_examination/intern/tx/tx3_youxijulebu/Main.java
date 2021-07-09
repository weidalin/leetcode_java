package written_examination.intern.tx.tx3_youxijulebu;

import java.util.Scanner;

public class Main {
    static int res = Integer.MAX_VALUE;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n = sc.nextInt();
            int[] time = new int[n];
            int[] punish = new int[n];
            int max_time = -1;
            for(int i = 0; i < n; i++){
                time[i] = sc.nextInt();
                if(time[i] > max_time)  max_time = time[i];
            }
            for(int i = 0; i < n; i++){
                punish[i] = sc.nextInt();
            }
            dfs(0, time, punish, max_time);
            System.out.println(res);

        }
    }

    private static void dfs(int cur_time, int[] times, int[] punish, int max_time) {
        if(cur_time == max_time){
            int punished = count_punished(punish);
            if(res > punished){
                res = punished;
            }
        }
        //选择列表
        int tmp ;
        for (int i = 0; i < punish.length; i++){
            if(punish[i] != 0 && times[i] > cur_time){
                tmp = punish[i];
                punish[i] = 0;
                dfs(cur_time + 1, times, punish, max_time);
                punish[i] = tmp;
                dfs(cur_time + 1, times, punish, max_time);
            }

        }
    }
    private static int count_punished(int[] punish) {
        int punished = 0;
        for(int i = 0; i < punish.length; i++){
            punished += punish[i];
        }
        return punished;
    }
}

/**
1
3
3 1 1
3 6 9
 */

