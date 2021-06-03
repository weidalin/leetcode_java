package leetcode.listnode.hot206_reverseList;

import tools.ListNode;

public class reverseList_1 {
    /**
     * //1.递归
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null, prepre = null, cur = head;
        while(cur != null){
            pre = cur;
            cur = cur.next;
            pre.next = prepre;
            prepre = pre;
        }
        return prepre;
    }
}
