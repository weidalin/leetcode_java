package written_examination.autumn.autumn07_bilibili.bilibili01_reach100;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/8/25 7:38 下午
 */

public class Main {
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
        int[] dp = new int[maxChooseNum + 1];
        boolean[] bool = new boolean[maxChooseNum];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < maxChooseNum; i++){
            list.add(i + 1);
        }
        for(int i = 1; i <= maxChooseNum; i++){
            int idx = choose(dp, bool, list, i, targetNum);
            if(idx == 1){
                return true;
            }


        }
        return false;
    }

    private static int choose(int[] dp, boolean[] bool, List<Integer> list, int i, int target) {
        for(int num : list){
            if(dp[i] + num >= target){
                return 1;
            }
        }
        return 1;
    }
}

/*

100 45 5
5
100 70 5 5 55
1 2 2 2 3

2
*
 */