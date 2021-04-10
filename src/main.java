import tools.ListNode;
import tools.TreeNode;

import java.util.List;

import static leetcode.dp.fib.dp281_robII.robII_1.rob;
import static leetcode.dp.matrixpath.minPathSum.dp62_uniquePaths.UniquePaths_1.uniquePaths;
import static leetcode.dp.matrixpath.minPathSum.dp64_minPathSum.minPathSum_1.minPathSum;
import static leetcode.sort.sort215_findKthLargest.FindKthLargest_1.findKthLargest;
import static leetcode.sort.sort373_topKFrequent.TopKFrequent_1.topKFrequent;
import static leetcode.swordoffer.offer54_kthLargest.KthLargest_2.kthLargest;
import static newcode.sort.getLeastNumbers.GetLeastNumbers_Solution_1.GetLeastNumbers_Solution;
import static tools.TreeNode.InitTree;
import static tools.Weida_utils.*;

public class main {
    public  static void main(String[] args) {
        //input #############################################################################################
        int[] nums = {1,2,3,1};

        int k = 1;

        int x = 1 , y = 4;

        int[] list_input_1 = {3,2,1,5,6,2,3,2,2,4};
        int[] list_input_2 = {9,15,7,20,3};
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] matrix2 = {{1,3,1},{1,5,1},{4,2,1}};

        Integer[] tree_input_1 = {5,3,6,2,4,null,null,1};
        Integer[] tree_input_2 = {9,15,7,20,3};

        String s = "lili";
        String t = "coco";

        ListNode list_1 = make_list(list_input_1);
        ListNode list_2 = make_list(list_input_2);

        TreeNode treeNode_1 = InitTree(tree_input_1);
        TreeNode treeNode_2 = InitTree(tree_input_2);
        //#############################################################################################
        int res = kthLargest(treeNode_1, 3);
        System.out.print(res);
    }

}