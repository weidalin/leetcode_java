package leetcode.labuladong.binarytree.binarytree538_convertBST;

import tools.ListNode;
import tools.TreeNode;

import static leetcode.labuladong.binarytree.binarytree538_convertBST.convertBST_1.convertBST;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.make_list;
import static tools.Weida_utils.print_tree;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {3,2,6,5,0,3};

        int k = 1;

        int x = 1 , y = 4;

        int[] list_input_1 = {9,3,15,20,7};
        int[] list_input_2 = {9,15,7,20,3};

        Integer[] tree_input_1 = {3,1,4,null,2};
        Integer[] tree_input_2 = {9,15,7,20,3};

        String s = "lili";
        String t = "coco";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);
        //#############################################################################################
        print_tree(treeNode_1);
        convertBST(treeNode_1);
        print_tree(treeNode_1);

    }

}