package written_examination.jingdong.jd1_votegift;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[m+1];
        Arrays.fill(nums, 0);
        int cur_max_index = -1;
        int cur_max_vote = 0;
        for(int i = 0; i < n; i++){
            int vote = sc.nextInt();
            nums[vote] += 1;
            if(cur_max_vote < nums[vote]){
                cur_max_vote = nums[vote];
                cur_max_index = vote;
            }
        }
        System.out.print(cur_max_index + " " + cur_max_vote);
    }
}
