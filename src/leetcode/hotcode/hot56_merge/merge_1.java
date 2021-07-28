package leetcode.hotcode.hot56_merge;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 56. 合并区间
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
 * 示例 1：
 *
 * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出：[[1,6],[8,10],[15,18]]
 * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 */
public class merge_1 {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        int[][] res = new int[intervals.length + 1][2];
        int idx = -1;
        for(int[] interval : intervals){
            // 第一个时不合并， 或者与前面刚加入res数组中的那个是相离的也不合并
            if(idx == -1 || res[idx][1] < interval[0]){
                res[++idx] = interval;
            }else{
                res[++idx][1] = Math.max(res[idx][1], interval[1]);
            }
        }
        return Arrays.copyOf(res, idx + 1);
    }
}
