package tools;

public class Weida_utils {
    //打印数组
    public static void print_arr(int[] arr){
        for (Object obj: arr){
            System.out.print(obj+" ");
        }
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
    public static void print_ListNode(ListNode list){
        while (list != null){
            System.out.print(list.val);
            System.out.print("-->");
            list = list.next;
        }
    }




}
