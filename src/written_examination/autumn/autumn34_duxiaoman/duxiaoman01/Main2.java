package written_examination.autumn.autumn34_duxiaoman.duxiaoman01;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/26 3:37 下午
 */

public class Main2 {
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

    private static int meetingRoom(String[][] nums) {
        int res = 0;
        if(nums == null || nums.length == 0){
            return 0;
        }
        Arrays.sort(nums,(o1, o2)->o1[0].compareTo(o2[0]));
        PriorityQueue<String> queue = new PriorityQueue<>((o1, o2)->o1.compareTo(o2));
        queue.add(nums[0][1]);
        for(int i = 1;i < nums.length;i++){
            if(nums[i][0].compareTo(queue.peek()) >= 0){
                queue.poll();
                res++;
            }
            queue.add(nums[i][1]);
        }
        return res;
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
