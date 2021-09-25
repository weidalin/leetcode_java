package written_examination.autumn.autumn27_xiaohongshu.xioahongshu01_;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/18 9:52 上午
 */
// ac
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] nums = new int[N][2];
        for(int i = 0; i < nums.length; i++){
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();
        }
        int res = meetingRoom(nums);
        System.out.println(res);
    }

    private static int meetingRoom(int[][] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        Arrays.sort(nums,(o1, o2)->o1[0]-o2[0]);
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2)->o1-o2);
        queue.offer(nums[0][1]);
        for(int i = 1;i < nums.length;i++){
            if(nums[i][0]>=queue.peek()){
                queue.poll();
            }
            queue.offer(nums[i][1]);
        }
        return queue.size();
    }
}
