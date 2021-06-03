package leetcode.listnode.hot234_palindrome;

import tools.ListNode;

import java.util.ArrayList;
import java.util.List;

/***
 * 234. 回文链表
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 */
public class Palindrome__2 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int n = list.size();
        for(int i = 0, j = n-1; i < n/2; i++,j--){
            if(list.get(i) != list.get(j)){
                return false;
            }
        }
        return true;
    }
}
/**
 * 显示详情
 * 执行用时：
 * 10 ms
 * , 在所有 Java 提交中击败了
 * 24.15%
 * 的用户
 * 内存消耗：
 * 50.5 MB
 * , 在所有 Java 提交中击败了
 * 24.80%
 * 的用户
 * 炫耀一下:
 */
