package leetcode.labuladong.binarytree.binarytree105_buildTree.buildTree;

import tools.TreeNode;

import java.util.HashMap;
import java.util.Map;

/*
根据一棵树的前序遍历与中序遍历构造二叉树。

注意:
你可以假设树中没有重复的元素。

例如，给出

前序遍历 preorder =[3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]
返回如下的二叉树：

    3
   / \
  9  20
    /  \
   15   7

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class buildTree_1 {
    private static HashMap<Integer, Integer> indexMap;
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        indexMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++){
            indexMap.put(inorder[i], i);
        }
        return helper(preorder,0, n-1, inorder, 0, n-1);

    }

    private static TreeNode helper(int[] preorder,  int l1, int r1, int[] inorder, int l2, int r2) {
        if(l1 > r1) return null;
        //前序遍历中第一个节点就是根节点
        int preorder_root = l1;
        //找到中序遍历列表中的根节点位置
        int inorder_root_idx = indexMap.get(preorder[preorder_root]);
        TreeNode root = new TreeNode(preorder[preorder_root]);

        //得到左子树中的节点数目
        int size_left_subtree = inorder_root_idx - l2;
        root.left = helper(preorder, l1 +1, l1 + size_left_subtree, inorder, l2, inorder_root_idx - 1);
        root.right = helper(preorder, l1 + size_left_subtree + 1, r1, inorder, inorder_root_idx + 1, r2);
        return root;
    }
/**
 * 执行结果：
 * 通过
 * 显示详情
 * 执行用时：
 * 3 ms
 * , 在所有 Java 提交中击败了
 * 65.84%
 * 的用户
 * 内存消耗：
 * 38.7 MB
 * , 在所有 Java 提交中击败了
 * 39.66%
 * 的用户
 * 炫耀一下:
 */
}
