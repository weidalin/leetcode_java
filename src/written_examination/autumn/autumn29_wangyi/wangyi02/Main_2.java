package written_examination.autumn.autumn29_wangyi.wangyi02;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/18 7:14 下午
 */
// 42
public class Main_2 {
    static int n;
    static String str;
    static int res;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        str = input.split(" ")[0];
        n = Integer.valueOf(input.split(" ")[1]);
//        str = "CCCCC";
//        n = 3;
        res = Integer.MAX_VALUE;
        moveStep(str, n);
        System.out.println(res);
    }

    private static void moveStep(String str, int n) {
        dfs(str.charAt(0)-'A', 0, 0, 0, false);
    }

    private static void dfs(int blurIdx, int strIdx, int curM, int curMoveStep, boolean flat) {
        if(strIdx == str.length()){
            if(curM == n || curM == 0)
                res = Math.min(curMoveStep, res);
            return;
        }
        if(curM > n){
            return;
        }
        // 1. 慢慢走
        int thisChIdx = str.charAt(strIdx) - 'A';
        if(flat == false) {
            int minOriginMove = getMinOriginMove(blurIdx, thisChIdx);
            dfs(thisChIdx, strIdx + 1, curM, curMoveStep + minOriginMove + 1, flat);
            // 2. 魔法步
            dfs(thisChIdx, strIdx + 1, curM + 1, curMoveStep + 2, true);
        }else{
            dfs(thisChIdx, strIdx + 1, curM + 1, curMoveStep + 2, flat);
        }
    }

    private static int getMinOriginMove(int blurIdx, int thisChIdx) {
        int left = 0, right = 0;
        if(blurIdx > thisChIdx){
            // 1. 向左
            left = blurIdx - thisChIdx;
            // 2. 向右
            right = thisChIdx + 26 - blurIdx;
        }else{
            left = blurIdx + 26 - thisChIdx;
            right = thisChIdx - blurIdx;
        }
        return left > right ? right : left;
    }


}
/*
ACAC 2
8
 */
