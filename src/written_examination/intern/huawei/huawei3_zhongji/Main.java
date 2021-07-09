package written_examination.intern.huawei.huawei3_zhongji;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] broads = new int[n];
        for(int i = 0; i < n; i++){
            broads[i] = sc.nextInt();
        }
        int achieve = broads[0];
        int target = n;
        int res = dfs(1, broads, achieve, target, target - achieve) + 1;
        System.out.println(res);
    }

    private static int dfs(int i, int[] broads, int achieve, int target, int cur_min) {
        if(achieve >= target){
            return 0;
        }
        if(i >= broads.length - 1){
            return 0;
        }
        if(achieve + broads[i] >= target) {
            return 1;
        }
        for(int j = i; j <= achieve; j++){
            int use_it = dfs(j, broads, achieve + broads[j], target, cur_min) + 1;
            if(use_it < cur_min){
                cur_min = use_it;
            }
        }
        return cur_min;
    }
}

/**
 6
 1 1 1 1 1 1


 6
 2 5 1 1 1 1

 6
 1 1 1 2 1 1

 1
 1

 */