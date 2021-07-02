package leetcode.hotcode.hot394_decodeString;

import java.util.LinkedList;
import java.util.List;

public class test {
    public static String decodeString(String s) {
        // 需要两个stack 存储当前str 以及 multi
        LinkedList<Integer> stack_multi = new LinkedList<>();
        LinkedList<String>  stack_res = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        int multi = 0;

        for(Character c : s.toCharArray()){
            // 1. [
            if(c == '['){
                stack_res.addLast(res.toString());
                res = new StringBuilder();
                stack_multi.add(multi);
                multi = 0;
            }
            // 2. ]
            else if(c == ']'){
                int cur_multi = stack_multi.removeLast();
                StringBuilder tmp = new StringBuilder();
                for(int i = 0; i < cur_multi; i++){
                    tmp.append(res);
                }
                res = new StringBuilder(stack_res.removeLast() + tmp.toString());
            }
            // 3. 数字
            else if(c >= '0' && c <= '9'){
                multi = multi * 10 + Integer.parseInt(c + "");
            }
            // 4. 字母
            else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
//    时间复杂度 O(N)O(N)，一次遍历 s；
//    空间复杂度 O(N)O(N)，辅助栈在极端情况下需要线性空间，例如 2[2[2[a]]]。
