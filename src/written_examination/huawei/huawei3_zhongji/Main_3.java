package written_examination.huawei.huawei3_zhongji;

import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] broads = new int[n];
        for(int i = 0; i < n; i++){
            broads[i] = sc.nextInt();
        }
        int achieve = broads[0];
        int target = n - broads[0];
        int res = dfs(1, broads, achieve, target) + 1;
        System.out.println(res);
    }

    private static int dfs(int i, int[] broads, int achieve, int target) {
        int res = target - achieve;
        if(i >= broads.length){
            return res;
        }
        if(achieve >= target){
            return 0;
        }
        if(achieve + broads[i] >= target) {
            return 1;
        }
        for(int j = 1; j <= achieve; j++){
            int use_it = dfs(i+j, broads, achieve + broads[i], target) + 1;
            if(use_it < res){
                res = use_it;
            }
        }
        return res;
    }
}

/**
 6
 2 5 1 1 1 1


25 */
