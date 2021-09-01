package written_examination.autumn.autumn04_meituan.else_test;

/**
 * 200. 岛屿数量
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 *
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 *
 * 此外，你可以假设该网格的四条边均被水包围。
 *
 * 示例 1：
 *
 * 输入：grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * 输出：1
 * 示例 2：
 *
 * 输入：grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * 输出：3
 */
public class numIslands_1 {
    private int res;
    public int numIslands(char[][] grid) {
        res = Integer.MAX_VALUE;
        dfs(grid, 0, 0, 0);

        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private void dfs(char[][] grid, int i, int j, int cur) {
        if(i == grid.length-1 && j == grid[0].length-1){
            if(grid[0][0] == 0){
                cur -= 2;
            }else if(grid[0][0] == 1){
                cur -= 1;
            }
            res = Math.min(res, cur);
            return;
        }
        // 边界判断
        if(i >= grid.length || j >= grid[0].length || i < 0 || j < 0){
            return;
        }
        if(grid[i][j] == 0){
            cur += 2;
        }else if(grid[i][j] == 1){
            cur += 1;
        }else{
            return;
        }
        dfs(grid, i-1,j, cur);
        dfs(grid, i+1,j, cur);
        dfs(grid, i,j-1, cur);
        dfs(grid, i,j+1, cur);
        grid[i][j] = 2;
    }

    public static void main(String[] args) {


    }
}