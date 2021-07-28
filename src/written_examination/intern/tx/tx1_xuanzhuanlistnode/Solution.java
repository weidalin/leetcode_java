package written_examination.intern.tx.tx1_xuanzhuanlistnode;

import tools.ListNode;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param S ListNode类 val表示权值，next指向下一个元素
     * @return ListNode类
     */
    public static ListNode solve (ListNode S) {
        // write code here
        int n = 0;
        ListNode  head = S;
        int min = Integer.MAX_VALUE;

        while(head != null){
            if(min > head.val){
                min = head.val;
            }
            head = head.next;
            n++;
        }


        head = S;
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = head.val;
            head = head.next;
        }
        int[][] all_arr = new int[n][n];
        for(int i  = 0; i < n; i++){
            all_arr[i] = move(nums, i);
        }
        System.out.println(all_arr);
        return null;

    }

    private static int[] move(int[] nums, int i) {
        int[] res_num = new int[nums.length];
        for(int j = 0; j < nums.length; j++){
            res_num[j] = nums[nums.length - i];
            i++;
        }
        return res_num;
    }

    public static void main(String[] args){
        move(new int[]{1,2,3}, 2);
    }
}
