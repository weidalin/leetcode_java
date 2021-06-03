package leetcode.listnode.leetcode61_rotateRight;

import tools.ListNode;

public class rotateRight_1 {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode tail = head, new_tail = head;
        int n = 1;
        while(tail.next != null){
            tail = tail.next;
            n ++;
        }
        tail.next = head;

        for(int i = 0; i < n - k % n - 1; i++){
            new_tail = new_tail.next;
        }
        ListNode new_head = new_tail.next;
        new_tail.next = null;
        return new_head;
    }
}
