package written_examination.autumn.autumn07_bilibili.bilibili01_reach100;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/8/25 7:38 下午
 */

public class Main_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i++){
            String str = sc.nextLine();
            int maxChooseNum = Integer.parseInt(str.split(",")[0]);
            int targetNum = Integer.parseInt(str.split(",")[1]);
            boolean b = firstReach(maxChooseNum, targetNum);
            System.out.println(b);
        }
    }
    /*
2
4,10
1,1
     */

    private static boolean firstReach(int maxChooseNum, int targetNum) {
        int[] nums = new int[maxChooseNum];
        boolean[] bool = new boolean[maxChooseNum];
        int sum = 0;
        for(int i = 0; i < maxChooseNum; i++){
            nums[i] = i + 1;
            sum += nums[i];
        }
        if(sum <= targetNum / 2){
            return false;
        }
        int resB = 0;
        for(int i = 0; i < maxChooseNum; ){
            if(bool[maxChooseNum - i - 1] == false){
                resB += nums[maxChooseNum - i - 1];
                bool[maxChooseNum - i - 1] = true;
                if(resB >= targetNum){
                    return true;
                }
            }
            i += 2;
        }
        return false;
    }
}
