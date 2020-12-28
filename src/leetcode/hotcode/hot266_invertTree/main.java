package leetcode.hotcode.hot266_invertTree;

import tools.ListNode;
import tools.TreeNode;

import static leetcode.hotcode.hot266_invertTree.InvertTree_2.invertTree;
import static leetcode.hotcode.hot617_mergeTrees.MergeTrees_1.mergeTrees;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.make_list;
import static tools.Weida_utils.print_tree;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {3,2,6,5,0,3};

        int k = 2;

        int[] list_input_1 = {2,4,3};
        int[] list_input_2 = {5,6,4};

        Integer[] tree_input_1 = {1,3,2,5};
        Integer[] tree_input_2 = {2,1,3,null,4,null,7};

        String s = "lili";
        String t = "coco";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);
        //#############################################################################################
        TreeNode res = mergeTrees(treeNode_1, treeNode_2);

        print_tree(res);
        System.out.print("\n");
        print_tree(invertTree(res));



    }
}