package written_examination.autumn.autumn06_jibite.jibite02_display;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/8/24 8:58 下午
 */

public class Main {
    static int res;
    public static void main(String[] args) {
        res = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] nums = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                nums[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        boolean[][] visited = new boolean[n][m];
        HashSet<boolean[][]> vis = new HashSet<>();
        dfs(nums, 0, 0, visited, vis);
        System.out.println(res);
    }

    private static void dfs(int[][] nums, int i, int j, boolean[][] visited, HashSet<boolean[][]> vis) {
        // 1. 结束条件
        if(i == nums.length || j == nums[0].length){
            if(!vis.contains(visited))
                res++;
            else
                vis.add(visited);
            return;
        }

        if(nums[i][j] == 1 && judge(i, j, visited)){
            visited[i][j] = true;
            dfs(nums, i + 1, j + 1, visited, vis);
            visited[i][j] = false;
        }
        dfs(nums, i + 1, j, visited, vis);
        dfs(nums, i, j + 1, visited, vis);
    }

    private static boolean judge(int i, int j, boolean[][] visited) {
        if(i-1 > 0 && visited[i-1][j] == true){
            return false;
        }

        if(j-1 > 0 && visited[i][j-1] == true){
            return false;
        }
        return true;
    }
    /*

2 3
1 1 1
0 1 0
     */
}
