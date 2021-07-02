package leetcode.Interval.leetcode57_insert;

import java.util.Arrays;

/**
 * 57. 插入区间
 * 给你一个 无重叠的 ，按照区间起始端点排序的区间列表。
 *
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 *
 * 示例 1：
 *
 * 输入：intervals = [[1,3],[6,9]], newInterval = [2,5]
 * 输出：[[1,5],[6,9]]
 */
public class insert_1 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] res = new int[intervals.length + 1][2];
        int idx = 0;

        int i = 0;
        // 将新区间左边且相离的区间加入结果集
        while(i < intervals.length && intervals[i][1] < newInterval[0]){
            res[idx++] = intervals[i++];
        }
        // 当前区间是否与新区间是否重叠， 重叠则合并，知道当前区间在新区建的右边且相离
        while(i < intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        res[idx++] = newInterval;
        while(i < intervals.length){
            res[idx++] = intervals[i++];
        }
        return Arrays.copyOf(res,idx);
    }
}
