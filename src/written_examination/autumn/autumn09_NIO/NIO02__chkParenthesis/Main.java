package written_examination.autumn.autumn09_NIO.NIO02__chkParenthesis;

import java.util.Stack;

/**
 * @author linweida
 * 2021/8/28 7:26 下午
 */
// 100%
public class Main {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        if(A.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for(Character ch : A.toCharArray()){
            if(ch == '('){
                stack.add(ch);
            }else if(ch == ')'){
                if(stack.isEmpty()){
                    return false;
                }else{
                    stack.pop();
                }
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
