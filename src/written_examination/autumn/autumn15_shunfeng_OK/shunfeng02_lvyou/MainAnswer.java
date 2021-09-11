package written_examination.autumn.autumn15_shunfeng_OK.shunfeng02_lvyou;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/6 8:45 下午
 */
// https://blog.csdn.net/xin_jun/article/details/117393947?utm_medium=distribute.pc_relevant.none-task-blog-2
public class MainAnswer {
    static int res = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

//      dp[i,j] = max(dp[i-1][j], dp[i-1][j-1]+ai)
        int s = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            s += nums[i];
            pq.add(nums[i]);
            while(s < 0){
                s -= pq.peek();
                pq.poll();
            }
        }
        System.out.println(pq.size());
    }
}
/*

6
4 -4 1 -3 1 -3


 */
