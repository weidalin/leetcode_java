package tools;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Weida_utils {
    //打印数组
    public static void print_arr(int[] arr){
        for (Object obj: arr){
            System.out.print(obj+" ");
        }
    }

    public static void print_2darr(int[][] arrs){
        for (int[] arr: arrs){
            print_arr(arr);
            System.out.println();
        }
    }
    public static void print_ListNode(ListNode list){
        while (list != null){
            System.out.print(list.val);
            System.out.print("-->");
            list = list.next;
        }
    }

    /**
     * 广度优先打印
     * @param root
     */
    public static void print_tree(TreeNode root){
        System.out.print("[");
        Queue<TreeNode> queue = new LinkedList<>();
//        List<List<Integer>> res = new ArrayList<>();
        if(root != null)
            queue.add(root);
        while(!queue.isEmpty()){
//            List<Integer> tmp = new ArrayList<>();
            for(int i=queue.size(); i>0; i--){
                TreeNode node = queue.poll();
//                tmp.add(node.val);
                System.out.print(node.val+",");

                if(node.left == null && node.right == null)
                    continue;
                if(node.left != null)
                    queue.add(node.left);
                else
                    System.out.print("null,");
                if(node.right != null)
                    queue.add(node.right);
                else
                    System.out.print("null,");
            }
//            res.add(tmp);

        }System.out.print("\b]");
    }


    //2.make_list
    public static ListNode make_list(int[] arrs){
        tools.ListNode pre = new ListNode(0);
        tools.ListNode cur = pre;

        for (Integer arr: arrs){
            cur.next = new ListNode(arr);
            cur = cur.next;
        }
        return pre.next;

    }


    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }






}
