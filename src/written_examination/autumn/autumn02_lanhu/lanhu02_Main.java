package written_examination.autumn.autumn02_lanhu;

import java.util.Scanner;
import java.util.Stack;

public class lanhu02_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int res = judge(str);
        System.out.println(res);
    }
    private static int judge(String str) {
        if(judge_str(str)){
            return str.length();
        }
        return Math.max(judge(str.substring(1)), judge(str.substring(0, str.length() - 1)));
    }

    private static boolean judge_str(String str) {
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '('){
                stack.add(ch);
            }else if(stack.isEmpty()){
                return false;
            }else{
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
