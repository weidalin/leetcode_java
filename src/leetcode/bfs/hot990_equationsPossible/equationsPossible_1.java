package leetcode.bfs.hot990_equationsPossible;

/**
 * 990. 等式方程的可满足性
 * 给定一个由表示变量之间关系的字符串方程组成的数组，每个字符串方程 equations[i] 的长度为 4，并采用两种不同的形式之一："a==b" 或 "a!=b"。在这里，a 和 b 是小写字母（不一定不同），表示单字母变量名。
 *
 * 只有当可以将整数分配给变量名，以便满足所有给定的方程时才返回 true，否则返回 false。
 *
 * 示例 1：
 *
 * 输入：["a==b","b!=a"]
 * 输出：false
 * 解释：如果我们指定，a = 1 且 b = 1，那么可以满足第一个方程，但无法满足第二个方程。没有办法分配变量同时满足这两个方程。
 */
public class equationsPossible_1 {
    public static boolean equationsPossible(String[] equations) {
        int[] parent = new int[26];
        for(int i = 0; i < 26; i++){
            parent[i] = i;
        }
        for(String str : equations){
            if(str.charAt(1) == '='){
                int idx1 = str.charAt(0) - 'a';
                int idx2 = str.charAt(3) - 'a';
                union(parent, idx1, idx2);
            }
        }
        for(String str : equations){
            if(str.charAt(1) == '!'){
                int idx1 = str.charAt(0) - 'a';
                int idx2 = str.charAt(3) - 'a';
                if(find(parent, idx1) == find(parent, idx2)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void union(int[] parent, int idx1, int idx2){
        parent[find(parent, idx1)] = find(parent, idx2);
    }
    public static int find(int[] parent, int idx){
        while(parent[idx] != idx){
            parent[idx] = parent[parent[idx]];
            idx = parent[idx];
        }
        return idx;
    }
}
