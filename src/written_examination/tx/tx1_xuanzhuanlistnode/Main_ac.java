package written_examination.tx.tx1_xuanzhuanlistnode;

import tools.ListNode;

public class Main_ac {
    /**
     *
     * 题目：https://www.nowcoder.com/discuss/643658?type=post&order=time&pos=&page=1&channel=-1&source_id=search_post_nctrack
     * 代码：https://www.nowcoder.com/discuss/643588?channel=-1&source_id=profile_follow_post_nctrack
     *
     *
     *
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param S ListNode类 val表示权值，next指向下一个元素
     * @return ListNode类
     */
    static ListNode head;
    static int len;
    public static ListNode solve (ListNode S) {
        head = S;
        ListNode ret = S;
        ListNode p = S.next;
        getlen(S);
        //找到最小的以ret为开头的链表
        for(int i = 1; i < len; i++, p = p.next){
            if(cmp(ret, p) > 0){ //如果ret > p， 让p 取代ret
                ret = p;
            }
        }
        p = ret;
        while(len-- > 0){
            if(p.next == null && len > 0){
                p.next = head;
            }else if(len == 0){
                p.next = null;
            }
            p = p.next;
        }
        return ret;
    }

    /**
     * 判断链表pa 和 pb是否相等， 如果相等返回0， 否则返回第一个不相等的链表节点的差值a-b
     * @param pa
     * @param pb
     * @return
     */
    private static int cmp(ListNode pa, ListNode pb) {
        ListNode a = pa;
        ListNode b = pb;
        int cnt = len;
        while(cnt-- > 0){
            if(a.val != b.val){
                return a.val - b.val;
            }
            a = a.next;
            b = b.next;
            if(a == null){
                a = head;
            }
            if(b == null){
                b = head;
            }
        }
        return 0;
    }

    private static void getlen(ListNode S) {
        len = 0;
        ListNode x = S;
        while(x != null){
            x = x.next;
            len++;
        }
    }


}
