package leetcode.dp.bilibili01_reach100;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/8/25 7:38 下午
 */

public class Main_answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i++){
            String str = sc.nextLine();
            int maxChooseNum = Integer.parseInt(str.split(",")[0]);
            int targetNum = Integer.parseInt(str.split(",")[1]);
            boolean b = canIWin(maxChooseNum, targetNum);
            System.out.println(b);
        }
    }

    /*
2
4,10
1,1
     */

    // https://leetcode-cn.com/problems/can-i-win/solution/464-wo-neng-ying-ma-dai-bei-wang-lu-de-d-qu1t/
    public static boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if(maxChoosableInteger >= desiredTotal) return true;
        if((1+maxChoosableInteger) * maxChoosableInteger / 2 < desiredTotal)    return false;
        return dfs(maxChoosableInteger, 0, new Boolean[1 << maxChoosableInteger], desiredTotal);
    }
    public static boolean dfs(int maxChoosableInteger, int state, Boolean[] dp, int desiredTotal){
        if(dp[state] != null){
            return dp[state];
        }
        for(int i = 1; i <= maxChoosableInteger; i++){
            int cur = 1 << (i - 1);
            if((cur & state) != 0)  continue;

            if(i >= desiredTotal || !dfs(maxChoosableInteger, state | cur, dp, desiredTotal - i)){
                return dp[state] = true;
            }
        }
        return dp[state] = false;
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