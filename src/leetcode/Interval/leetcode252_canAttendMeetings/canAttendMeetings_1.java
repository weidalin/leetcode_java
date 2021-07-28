package leetcode.Interval.leetcode252_canAttendMeetings;

import java.util.Arrays;

/**
 * 力扣 252. 会议室
 * 难度：Easy
 *
 * 给定一个会议时间安排的数组 intervals ，每个会议时间都会包括开始和结束的时间 intervals[i] = [starti, endi] ，请你判断一个人是否能够参加这里面的全部会议。
 *
 * 示例 1:：
 * 输入: intervals = [[0,30],[5,10],[15,20]]
 * 输出: false
 * 解释: 存在重叠区间，一个人在同一时刻只能参加一个会议。
 *
 * 示例 2:：
 * 输入: intervals = [[7,10],[2,4]]
 * 输出: true
 * 解释: 不存在重叠区间。
 */
public class canAttendMeetings_1 {
    public boolean canAttendMeetings(int[][] intervals) {
        // 将区间按照会议开始实现升序排序
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        // 遍历会议， 如果下一个会议在前一个会议结束之前就开始了，就false
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] < intervals[i-1][1]){
                return false;
            }
        }
        return true;
    }
}