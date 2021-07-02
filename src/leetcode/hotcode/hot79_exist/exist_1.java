package leetcode.hotcode.hot79_exist;

/**
 * 79. 单词搜索
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
 *
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *
 * 示例 1：
 *
 * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * 输出：true
 */
public class exist_1 {
    public static boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(dfs(visited, board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    private static boolean dfs(boolean[][] visited, char[][] board, String word, int i, int j, int idx) {
        if(idx >= word.length()) {
            return true;
        }
        if(i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word.charAt(idx)){
            return false;
        }else if(board[i][j] == word.charAt(idx) && visited[i][j] == false){
            visited[i][j] = true;
            boolean res =  dfs(visited, board, word, i + 1, j, idx + 1) ||
                    dfs(visited, board, word, i -1 , j, idx + 1) ||
                    dfs(visited, board, word, i , j + 1, idx + 1) ||
                    dfs(visited, board, word, i , j - 1, idx + 1) ;
            visited[i][j] = false;
            return res;
        }
        return false;
    }
}
