package leetcode.listnode.hot206_reverseList;

import tools.ListNode;

public class reverseList_3 {
    /**
     * //1.递归
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {


    if (head == null || head.next == null)
        return head;

    ListNode p = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return p;

    }
}
