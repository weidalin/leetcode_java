package written_examination.autumn.autumn15_shunfeng_ok.shunfeng02_lvyou;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/6 8:45 下午
 */

public class Main2 {
//    作者：712酱
//    链接：https://www.nowcoder.com/discuss/733632?type=post&order=time&pos=&page=2&ncTraceId=&channel=-1&source_id=search_post_nctrack
//    来源：牛客网

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int maxS = 0;
        for(int i=0;i<n;i++){
            int cur = scanner.nextInt();
            nums[i] = cur;
        }
        int fun = fun(nums, 0, 0, 0);

        System.out.println(fun);
    }
    private static int fun(int[] nums,int day,int happy,int count){
        // 旅行结束
        if(happy<0 || day==nums.length) return count;

        for(int i=day;i<nums.length;i++){
            if(happy<0) return count;
            if(nums[i]<0){
                int buy = fun(nums,i+1,happy+nums[i],1)+count;
                int unbuy = fun(nums,i+1,happy,0)+count;
                System.out.println("buy:"+buy);
                System.out.println("unbuy:"+unbuy);
                count = Math.max(buy,unbuy);
                System.out.println("count:"+count);
                return count;
            }
            else {
                happy = happy+nums[i];
                count++;
            }
        }
        return count;
    }
}
/*

6
4 -4 1 -3 1 -3

输出5

 */
