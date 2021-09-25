package written_examination.autumn.autumn29_wangyi.wangyi04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/18 8:05 下午
 */

public class Main {
    static int n;
    static int a;
    static int b;
    static HashMap<Integer, Integer> map;
    static int res;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        sc.nextLine();
        char[][] grid = new char[n][n];
        for(int i = 0; i < n; i++){
            grid[i]  = sc.nextLine().toCharArray();
        }
        map = new HashMap<>();
        res = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                map.put(i, j);
            }
        }
        dfs(grid, 0, 0, 0);
        System.out.println(res);
    }


    private static void dfs(char[][] grid, int i, int j, int curConsume) {
        if(i == n-1 && j == n-1){
            res = Math.min(res, curConsume);
            return;
        }
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length){
            return ;
        }
        if(grid[i][j] == '!'){
            return;
        }else if(grid[i][j] == '.'){
            grid[i][j] = '!';
            dfs(grid,i-1, j, curConsume);
            dfs(grid,i+1, j, curConsume);
            dfs(grid,i, j-1, curConsume);
            dfs(grid,i, j+1, curConsume);
            return;
         }else if(grid[i][j] == '#'){
            grid[i][j] = '!';
            dfs(grid,i-1, j, curConsume + a);
            dfs(grid,i+1, j, curConsume + a);
            dfs(grid,i, j-1, curConsume + a);
            dfs(grid,i, j+1, curConsume + a);
            return;

        }else if(grid[i][j] == '*'){
            grid[i][j] = '!';
            dfs(grid,i-1, j, curConsume);
            dfs(grid,i+1, j, curConsume);
            dfs(grid,i, j-1, curConsume);
            dfs(grid,i, j+1, curConsume);
            grid[i][j] = '*';
            for(int key : map.keySet()){
                if(key == i)    continue;

                int ii = key;
                int jj = map.get(key);
                map.remove(ii);
                map.remove(i);
                dfs(grid,ii, jj, curConsume + b);
                map.put(i, j);
                map.put(ii, jj);
                return;
            }
        }
    }
}
/*
4 5 10
....
.##.
.##.
....
0

2 5 10
*#
#*

 5
 */
