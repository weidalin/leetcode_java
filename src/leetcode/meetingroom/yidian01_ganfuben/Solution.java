package leetcode.meetingroom.yidian01_ganfuben;

import java.util.ArrayList;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param timeSchedule string字符串ArrayList<ArrayList<>>
     * @return int整型
     */
    public int countMaxActivity (ArrayList<ArrayList<String>> timeSchedule) {
        // write code here
        int res = Integer.MAX_VALUE;
        int size = timeSchedule.size();
        String[][] times = new String[size][2];
        for(int i = 0; i < size; i++){
            times[i][0] = timeSchedule.get(i).get(0);
            times[i][1] = timeSchedule.get(i).get(1);
        }

        String pre = "00:00";
        int tmp = 0;
        for(String[] time : times){
            if(time[0].compareTo(pre) >= 0){
                tmp++;
                pre = time[1];
            }
        }
        return tmp;

//        dp[i] = Math.max(dp[i-1],dp[i-2] + 1);
    }

    public static void main(String[] args) {
        String str1 = "10:00";
        String str2 = "09:00";
        int b = str1.compareTo(str2);
        System.out.println(b);
    }
}
/**
 *
 *
 [["10:00","12:00"],["03:00","11:30"],["11:30","14:00"]]
 2

 */
