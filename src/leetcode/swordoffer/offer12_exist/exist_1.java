package leetcode.swordoffer.offer12_exist;

public class exist_1 {
    /**
     * 剑指 Offer 12. 矩阵中的路径
     * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
     *
     * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
     *
     * 例如，在下面的 3×4 的矩阵中包含单词 "ABCCED"（单词中的字母已标出）。
     *
     *
     * 示例 1：
     *
     * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
     * 输出：true
     * 示例 2：
     *
     * 输入：board = [["a","b"],["c","d"]], word = "abcd"
     * 输出：false
     *
     * @param board
     * @param word
     * @return
     */
    static char[][] chars;
    static String str;
    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        chars = board;
        str = word;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(dfs(i,j, 0))    return true;
            }
        }
        return false;
    }

    private static boolean dfs(int row, int col,int i) {
        if(i == str.length()){
            return true;
        }
        if(row < 0 || col < 0 ||row >= chars.length || col >= chars[0].length || chars[row][col] != str.charAt(i)){
            return false;
        }
        chars[row][col] = '\0';
        boolean res =  dfs(row + 1, col, i+1) ||
        dfs(row - 1, col, i+1)||
        dfs(row, col + 1, i+1)||
        dfs(row, col - 1, i+1);
        chars[row][col] = str.charAt(i);
        return res;
    }



}
