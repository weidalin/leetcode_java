package leetcode.meetingroom.leetcode1353_maxEvents;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 1353. 最多可以参加的会议数目
 * 给你一个数组 events，其中 events[i] = [startDayi, endDayi] ，表示会议 i 开始于 startDayi ，结束于 endDayi 。
 *
 * 你可以在满足 startDayi <= d <= endDayi 中的任意一天 d 参加会议 i 。注意，一天只能参加一个会议。
 *
 * 请你返回你可以参加的 最大 会议数目。
 *
 * 示例 1：
 * 输入：events = [[1,2],[2,3],[3,4]]
 * 输出：3
 * 解释：你可以参加所有的三个会议。
 * 安排会议的一种方案如上图。
 * 第 1 天参加第一个会议。
 * 第 2 天参加第二个会议。
 * 第 3 天参加第三个会议。
 * 示例 2：
 *
 * 输入：events= [[1,2],[2,3],[3,4],[1,2]]
 * 输出：4
 */
public class maxEvents_1 {
    public static int maxEvents(int[][] events) {
        Arrays.sort(events, (o1,o2) -> o1[0] - o2[0]);
        // 小顶堆
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int res = 0, last = 1, i = 0, n = events.length;
        while(i < n || !pq.isEmpty()){
            //将start相同的会议都放进堆里
            while(i < n && events[i][0] == last){
                pq.offer(events[i++][1]);
            }
            //pop掉当前天数之前的
            while(!pq.isEmpty() && pq.peek() < last){
                pq.poll();
            }
            //顶上的就是俺们要参加的
            if(!pq.isEmpty()){
                pq.poll();
                res ++;
            }
            last++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] nums = {{1,2},{2,3},{3,4},{1,2}};
        int res = maxEvents(nums);
        System.out.println(res);
    }
}


/**
 */