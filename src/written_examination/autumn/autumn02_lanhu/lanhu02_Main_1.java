package written_examination.autumn.autumn02_lanhu;

import java.util.Scanner;
import java.util.Stack;

public class lanhu02_Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        int res = 0;
        int cur_res = 0;
        for(char ch : str.toCharArray()){
            if(ch == '('){
                stack.add(ch);
            }else if(stack.isEmpty()){
                cur_res = 0;
            }else{
                stack.pop();
                cur_res+=2;
                res = Math.max(cur_res, res);
            }
        }
        System.out.println(res);
    }
}
// )))()()))