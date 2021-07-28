package written_examination.intern.jingdong.jd2_pock;
import java.util.Arrays;
import java.util.Scanner;

public class Main_2 {
    static int count = 0;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] nums = new int[n + 1];
        boolean[] nums_help = new boolean[n + 1];

        Arrays.fill(nums, -1);
        Arrays.fill(nums_help, false);
        nums[0] = 0;
        nums[n] = n;
        nums_help[0] = true;
        nums_help[n] = true;
        dfs(nums, nums_help, 1);
        System.out.println(count);
    }

    private static void dfs(int[] nums, boolean[] nums_help, int cur_idx) {
        if(cur_idx == n && Math.abs(nums[cur_idx] - nums[cur_idx-1]) <= 2){
            count ++;
            if(count > 998244353){
                System.out.println(count);
            }
            count %= 998244353;
            return;
        }
        //2.候选队列
        for(int j = 1; j <= n; j++){
            //没有被利用过
            if(nums_help[j] == false){
                //选择他
                nums[cur_idx] = j;
                nums_help[j] = true;
                //判断能否继续下去
                if(Math.abs(nums[cur_idx] - nums[cur_idx-1]) <= 2){//能
                    dfs(nums, nums_help, cur_idx + 1);
                }else{
                    nums_help[j] = false;
                    nums[cur_idx] = -1;
                    break;
                }
                nums_help[j] = false;
                nums[cur_idx] = -1;
            }
        }
    }
}
