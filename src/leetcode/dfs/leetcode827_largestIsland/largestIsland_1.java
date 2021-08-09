package leetcode.dfs.leetcode827_largestIsland;

import java.util.*;

public class largestIsland_1 {
    public static int largestIsland(int[][] grid) {
        int res = 0, idx = 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        if(grid == null || grid.length == 0)    return 1;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    int area = dfs(grid, i, j, idx);
                    map.put(idx ++, area);
                    res = Math.max(res, area);
                }
            }
        }
        if(res == 0)    return 1;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0){
                    HashSet<Integer> set = new HashSet<>();
                    getNeighbor(grid, i, j, set);
                    int cur = 1;
                    if(set.size() < 1)  continue;
                    for(Integer setItem : set){
                        cur += map.get(setItem);
                    }
                    res = Math.max(res, cur);
                }
            }
        }
        return res;
    }

    private static void getNeighbor(int[][] grid, int i, int j, HashSet<Integer> set) {
        if(i - 1 >= 0 && grid[i-1][j] != 0){
            set.add(grid[i-1][j]);
        }
        if(j - 1 >= 0 && grid[i][j-1] != 0){
            set.add(grid[i][j-1]);
        }
        if(i + 1 < grid.length && grid[i+1][j] != 0){
            set.add(grid[i+1][j]);
        }
        if(j + 1 < grid[0].length && grid[i][j+1] != 0){
            set.add(grid[i][j+1]);
        }
    }

    private static int dfs(int[][] grid, int i, int j, int idx) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)    return 0;
        if(grid[i][j] == 1) {
            grid[i][j] = idx;
            return 1 + dfs(grid, i - 1, j, idx)
                    + dfs(grid, i + 1, j, idx)
                    + dfs(grid, i, j - 1, idx)
                    + dfs(grid, i, j + 1, idx);
        }else{
            return 0;
        }
    }

}
