package leetcode.labuladong.backtrack.bt51_solveNQueens;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
51. N 皇后
n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 */
public class solveNQueens {
    public static List<List<String>> solveNQueens(int n) {
        //第queens[i-1] = j 表示[i][j]放置了皇后
        char[][] queens = new char[n][n];
//        Arrays.fill(queens[0], '.');
        List<List<String>> res = new LinkedList<>();
        backtrack(queens, res,0,  n);
        return res;
    }

    private static void backtrack(char[][]  queens, List<List<String>> res, int i, int n) {
        //结束，生成结果
        if (i == n){
            res.add(generateBoard(queens));
            return;
        }
        //如果放得下
        for(int j = 0; j < n; j++){
            if (valid(queens, i, j)){
                queens[i][j] = 'Q';
                backtrack(queens, res,i + 1,  n);
                //撤销
                queens[i][j] = '.';
            }
        }
    }

    private static List<String> generateBoard(char[][] queens) {
        List<String> path = new ArrayList<>();
        for (int i = 0; i < queens.length; i++) {
            for(int j = 0; j < queens[0].length; j++)
                if (queens[i][j] != 'Q')
                    queens[i][j] = '.';
            path.add(new String(queens[i]));
        }
        return path;
    }

    //row表示第几行，col表示第几列
    private static boolean valid(char[][] chess, int row, int col) {
        //判断当前列有没有皇后,因为他是一行一行往下走的，
        //我们只需要检查走过的行数即可，通俗一点就是判断当前
        //坐标位置的上面有没有皇后
        for (int i = 0; i < row; i++) {
            if (chess[i][col] == 'Q') {
                return false;
            }
        }
        //判断当前坐标的右上角有没有皇后
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }
        //判断当前坐标的左上角有没有皇后
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
/**
 * 执行结果：
 * 通过
 * 显示详情
 * 执行用时：
 * 3 ms
 * , 在所有 Java 提交中击败了
 * 84.71%
 * 的用户
 * 内存消耗：
 * 38.6 MB
 * , 在所有 Java 提交中击败了
 * 76.36%
 * 的用户
 * 炫耀一下:
 */


    /**
     * [i,j] fit?
     * @param queens
     * @param i
     * @param j
     * @return
     */
    private static boolean fit(int[] queens, int i, int j) {
        //判断列
        for (int tmp = 0; tmp < i; tmp++){
            if(queens[tmp] == j)
                return false;
        }
        //判断行
        if (queens[i] != -1)
            return false;
        //判断右下斜对角线
        //判断左上斜对角线
        return true;
    }
}
