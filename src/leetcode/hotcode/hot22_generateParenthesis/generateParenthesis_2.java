//package leetcode.hotcode.hot22_generateParenthesis;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
///**
// * 22. 括号生成
// * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
// *
// * 示例 1：
// *
// * 输入：n = 3
// * 输出：["((()))","(()())","(())()","()(())","()()()"]
// * 示例 2：
// *
// * 输入：n = 1
// * 输出：["()"]
// *
// * 提示：
// *
// * 1 <= n <= 8
// */
//public class generateParenthesis_2 {
//    static List<String> res;
//    static int nn ;
//    public static List<String> generateParenthesis(int n) {
//        res = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//        nn = n;
//        dfs(0, sb);
//        return res;
//    }
//
//    private static void dfs(int i, StringBuilder sb) {
//        if(!just(sb)){
//            return ;
//        }
//        if(i == nn * 2 && sb.toString()){
//            res.add(sb.toString());
//            System.out.println(sb.toString());
//            return;
//        }
//        dfs(i + 1, sb.append("("));
//        sb.deleteCharAt(sb.length() - 1);
//
//        dfs(i + 1, sb.append(")"));
//        sb.deleteCharAt(sb.length() - 1);
//    }
//
//    private static boolean just(StringBuilder sb) {
//        Stack<Character> stack = new Stack<Character>();
//        for(char c : sb.toString().toCharArray()){
//            if(c == '('){
//                stack.add(c);
//            }
//            if(c == ')' && stack.isEmpty()){
//                return false;
//            }else if (c == ')'){
//                stack.pop();
//            }
//        }
//        return stack.isEmpty();
//    }
//}
