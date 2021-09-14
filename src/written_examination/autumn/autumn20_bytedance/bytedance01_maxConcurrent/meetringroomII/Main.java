package written_examination.autumn.autumn20_bytedance.bytedance01_maxConcurrent.meetringroomII;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author linweida
 * 2021/9/13 11:04 上午
 */

/**
 * 题目描述：
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],…] (si < ei), find the minimum number of conference rooms required.
 *
 * 样例：
 * Given intervals = [(0,30),(5,10),(15,20)], return 2.
 * ————————————————
 * 版权声明：本文为CSDN博主「DCY7074」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/qq_34355232/article/details/79656863
 */
public class Main {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{0,30},{5, 10}, {15,20}};
        int res = minMeetingRooms(nums);
        System.out.println(res);
    }
    public static int minMeetingRooms(int[][] intervals) {
        if(intervals == null || intervals.length == 0){
            return 0;
        }
        Arrays.sort(intervals,(o1, o2)->o1[0]-o2[0]);
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2)->o1-o2);
        queue.offer(intervals[0][1]);
        for(int i = 1;i < intervals.length;i++){
            if(intervals[i][0]>=queue.peek()){
                queue.poll();
            }
            queue.offer(intervals[i][1]);
        }
        return queue.size();
    }
}

/*
时间复杂度：
排序：O(NlogN)；插入和删除：O(logN)
所以总的时间复杂度为O(NlogN)
空间复杂度： O(N)
 */

//————————————————
//    版权声明：本文为CSDN博主「wmtmw」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/yinianxx/article/details/105785284
