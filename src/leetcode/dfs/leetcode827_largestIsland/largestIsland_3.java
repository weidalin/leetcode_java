package leetcode.dfs.leetcode827_largestIsland;

import java.util.HashMap;
import java.util.HashSet;

public class largestIsland_3 {
    public int largestIsland(int[][] grid) {
        if (grid == null || grid.length == 0) return 1;
        int res = 0;
        int index = 2;
        HashMap<Integer, Integer> indexAndAreas = new HashMap<>();
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    int area = area(grid, r, c, index);
                    indexAndAreas.put(index, area);
                    index++;
                    res = Math.max(res, area);
                }
            }
        }
        System.out.println(res);
        if (res == 0) return 1;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 0) {//遍历海洋格子
                    HashSet<Integer> hashSet = findNeighbour(grid, r, c);
                    if (hashSet.size() < 1) continue;
                    int twoIsland = 1;
                    for (Integer i : hashSet) twoIsland += indexAndAreas.get(i);
                    res = Math.max(res, twoIsland);
                }
            }
        }
        return res;
    }

    private HashSet<Integer> findNeighbour(int[][] grid, int r, int c) {
        HashSet<Integer> hashSet = new HashSet<>();
        if (inArea(grid, r - 1, c) && grid[r - 1][c] != 0)
            hashSet.add(grid[r - 1][c]);
        if (inArea(grid, r + 1, c) && grid[r + 1][c] != 0)
            hashSet.add(grid[r + 1][c]);
        if (inArea(grid, r, c - 1) && grid[r][c - 1] != 0)
            hashSet.add(grid[r][c - 1]);
        if (inArea(grid, r, c + 1) && grid[r][c + 1] != 0)
            hashSet.add(grid[r][c + 1]);
        return hashSet;
    }

    private int area(int[][] grid, int r, int c, int index) {
        if (!inArea(grid, r, c)) return 0;
        if (grid[r][c] != 1) return 0;
        grid[r][c] = index;
        return 1 + area(grid, r - 1, c, index) + area(grid, r + 1, c, index) + area(grid, r, c - 1, index) + area(grid, r, c + 1, index);
    }

    private boolean inArea(int[][] grid, int r, int c) {
        return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
    }
}
