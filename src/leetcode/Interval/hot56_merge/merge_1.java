package leetcode.Interval.hot56_merge;

import java.util.Arrays;

public class merge_1 {
    public int[][] merge(int[][] intervals) {
        // 1. 按照起始位置排序
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        int[][] res = new int[intervals.length][2];
        int idx = -1;
        for(int[] interval : intervals){
            // 如果数组是空的，或者当前区间的起始位置 > 数组中最后区间的终止位置，说明不重叠
            if(idx == -1 || interval[0] > res[idx][1]){
                res[++idx] = interval;
            }else{
                // 反之说明重叠
                res[idx][1] = Math.max(res[idx][1], interval[1]);
            }
        }
        return Arrays.copyOf(res, idx + 1);
    }
}
