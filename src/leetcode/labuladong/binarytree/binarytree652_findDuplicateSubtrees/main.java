package leetcode.labuladong.binarytree.binarytree652_findDuplicateSubtrees;

import tools.ListNode;
import tools.TreeNode;

import java.util.List;

import static leetcode.labuladong.binarytree.binarytree652_findDuplicateSubtrees.findDuplicateSubtrees_1.findDuplicateSubtrees;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.make_list;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {3,2,6,5,0,3};

        int k = 4;

        int x = 1 , y = 4;

        int[] list_input_1 = {9,3,15,20,7};
        int[] list_input_2 = {9,15,7,20,3};

        Integer[] tree_input_1 = {1,2,3,4,null,2,4,null,null,4};
        Integer[] tree_input_2 = {9,15,7,20,3};

        String s = "lili";
        String t = "coco";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);
        //#############################################################################################
        List<TreeNode> res = findDuplicateSubtrees(treeNode_1);
        System.out.println(res);

    }

}