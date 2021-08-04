package leetcode.meetingroom.yidian01_ganfuben;

import java.util.ArrayList;

public class Solution2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param timeSchedule string字符串ArrayList<ArrayList<>>
     * @return int整型
     * 会议室问题:
     * 1353. 最多可以参加的会议数目
     * https://leetcode-cn.com/problems/maximum-number-of-events-that-can-be-attended/
     */
    int size,res;
    String[][] times;
    public int countMaxActivity (ArrayList<ArrayList<String>> timeSchedule) {
        // write code here
        res = Integer.MIN_VALUE;
        size = timeSchedule.size();
        times = new String[size][2];
        for(int i = 0; i < size; i++){
            times[i][0] = timeSchedule.get(i).get(0);
            times[i][1] = timeSchedule.get(i).get(1);
        }
        dfs(0, 0, "00:00");
        return res;
    }

    private void dfs(int i, int tmp, String pre) {
        if(i == size){
            if(tmp > res)   res = tmp;
            return;
        }
        String[] time = times[i];
        if(time[0].compareTo(pre) >= 0) {
            tmp ++;
            dfs(i+1, tmp, time[1]);
            tmp--;
        }
        dfs(i + 1, tmp, pre);
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
