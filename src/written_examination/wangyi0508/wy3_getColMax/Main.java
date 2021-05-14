package written_examination.wangyi0508.wy3_getColMax;

import tools.TreeNode;

import java.util.*;

public class Main {

    // write code here
    static Map<Integer, Integer> map;
    public static int[] getColMax(TreeNode root) {
        map = new HashMap<>();
        dfs(root, 0, 0);
        int[] res = new int[map.size()];
        int i  = 0;
        int[] keys = new int[map.size()];
        for(int key : map.keySet()){
            keys[i++] = key;
        }
        i = 0;
        Arrays.sort(keys);
        for(int key : keys){
            res[i++] = map.get(key);
        }
        return res;
    }

    private static void dfs(TreeNode root, int x, int y) {
        if(root == null){
            return;
        }
        map.put(x,Math.max(root.val, map.getOrDefault(x, -1)));
        dfs(root.left, x - 1, y - 1);
        dfs(root.right, x + 1, y - 1);
    }

    public static void main(String[] args) {
        TreeNode tree = TreeNode.InitTree(new Integer[]{0, 1, 2, 3, 4, 5, null, null, 6});
        int[] res = getColMax(tree);
    }
}
//ac
