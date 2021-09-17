package written_examination.autumn.autumn26_tecentmusice.tmusic01_;

import tools.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static tools.TreeNode.InitTree;
import static tools.Weida_utils.print_arr;
import static tools.Weida_utils.print_tree;

/**
 * @author linweida
 * 2021/9/16 7:28 下午
 */

public class Main {
    public static void main(String[] args) {
        Integer[] tree_input_1 = {1,2,3,null,null,4,5};
        TreeNode root = InitTree(tree_input_1);
        TreeNode res = cyclicShiftTree(root, 2);
        print_tree(res);
    }

    public static TreeNode cyclicShiftTree (TreeNode root, int k) {
        // write code here
        if(root == null || root.left == null && root.right == null){
            return root;
        }
        List<List<Integer>> lists = getLayer(root);
        lists.remove(lists.size()-1);
        System.out.println(lists);
        Integer[] tree_input_1 = reverseList(lists, k);
        for(int num : tree_input_1){
            System.out.print(num);
        }

        TreeNode res = InitTree(tree_input_1);
        return res;
    }
    private static Integer[] reverseList(List<List<Integer>> lists, int k) {
        List<Integer> tree_input = new ArrayList<>();
        for(List list : lists){
            while(k-- > 0){
                list.add(list.size()-1, list.remove(0));
            }
            tree_input.addAll(list);
        }
        int size = tree_input.size();
        return tree_input.toArray(new Integer[size]);
    }

    private static List<List<Integer>> getLayer(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null)
            queue.add(root);
        while(!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if(node == null){
                    tmp.add(null);
                    continue;
                }else{
                    tmp.add(node.val);
                }
                if(node.left == null){
                    queue.add(null);
                }else{
                    queue.add(node.left);
                }
                if(node.right == null){
                    queue.add(null);
                }else {
                    queue.add(node.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }
    public static TreeNode InitTree(Integer[] vals) {
        TreeNode root = new TreeNode(vals[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        int cur = 1;
        queue.offer(root);
        while (queue != null) {
            TreeNode r = queue.poll();
            if (vals[cur] == null) {
                r.left=null;
            } else {
                r.left = new TreeNode(vals[cur]);
                queue.offer(r.left);
            }
            if (++cur >= vals.length) {
                break;
            }
            if (vals[cur] == null) {
                r.right = null;
            } else {
                r.right = new TreeNode(vals[cur]);
                queue.offer(r.right);
            }
            if (++cur >= vals.length) {
                break;
            }
        }
        return root;
    }
}
