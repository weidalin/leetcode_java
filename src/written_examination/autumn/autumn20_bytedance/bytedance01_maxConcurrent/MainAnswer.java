package written_examination.autumn.autumn20_bytedance.bytedance01_maxConcurrent;

import java.util.*;

/**
 * @author linweida
 * 2021/9/12 9:58 上午
 */

/**
 * 题目描述
 * 小M的程序设计大作业是编写一个多任务下载器，在做到计算任务并发数的时候遇到了困难。
 *
 * 在一次下载中，总共包含N个任务，每个任务会在第x秒开始、并持续y秒。小M想要知道，在一次下载中，同时最多会有多少个任务正在下载。
 *
 * 输入描述
 * 第一行输入一个正整数N，代表总共有N个任务
 * 之后共N行，每行包含两个正整数x、y，x代表任务开始的时间，y代表任务的持续时间。
 *
 * 2
 * 1 2
 * 2 3
 * 1
 * 2
 * 3
 * 输出描述
 * 输出包含一个整数，代表最高的任务并发数
 *
 * 2
 * 1
 * 解释
 * 第一个任务在第一秒开始，持续两秒;第二个任务在第二秒开始，持续三秒。故在第二秒时有两个任务同时在进行，最大并发数为2。
 * ————————————————
 * 版权声明：本文为CSDN博主「TechGuide」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/weixin_41896265/article/details/120257995
 */
public class MainAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][2];
        for(int i = 0; i < n; i++){
            nums[i][0] = sc.nextInt();
            nums[i][1] = nums[i][0] + sc.nextInt();
        }


        int res = getMaxConcurrent(nums);
        System.out.println(res);
    }

    private static int getMaxConcurrent(int[][] intervals) {
        if(intervals == null || intervals.length == 0){
            return 0;
        }
        Arrays.sort(intervals,(o1, o2)->o1[0]-o2[0]);
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2)->o1-o2);
        queue.offer(intervals[0][1]);
        int max = 0;
        for(int i = 1;i < intervals.length;i++){
            if(intervals[i][0]>=queue.peek()){
                queue.poll();
            }
            queue.offer(intervals[i][1]);
            max = Math.max(max, queue.size());
        }
        return max;
    }
}
/*

2
1 2
2 3

2


 */
