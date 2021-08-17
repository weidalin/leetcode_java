package written_examination.autumn.autumn04_meituan.meituan02_nchartofilltopaliam;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author linweida
 * 2021/8/15 10:31 上午
 * 一行一个字符串，代表小美交给你的字符串。
 *
 * 输出描述
 * 一行一个整数，表示将小美给出的字符串变成回文字符串所需要添补的最少字符数量。
 *
 * 小美现在有一个字符串，小美现在想知道能不能通过在字符串的尾端增加若干字符使得整个字符串变成一个回文串。
 *
 * 回文串的定义：若一个字符串，对他正序遍历和倒序遍历得到的结果是完全一致的，就称它是一个回文串。例如 abcba 就是一个回文串，因为无论正序还是倒序都是一样的。
 *
 *
 *
 * 对于字符串 abaaca，显然在该字符串末尾继续补上三个字符 aba 就可以构成 abaacaaba，就可以把原字符串变成回文串。换句话说，最少补上三个字符。
 *
 * 你的任务就是找到使得原来的字符串变成回文串所需要的最少字符数量。
 *
 * * 本题数据保证没有空串，因此不考虑空串是否为回文串。
 *
 * 保证输入的字符串仅包含小写字母。
 */

public class Main {
    static int res;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        res = str.length();
        Stack<Character> stack = new Stack<>();
        dfs(0, 1, str, stack);
        System.out.println(res);
    }

    private static void dfs(int i, int center, String str, Stack<Character> stack) {
        if(i == str.length()){
            res = Math.min(stack.size(), res);
            return;
        }
        char ch = str.charAt(i);
        // 1. 选择该点作为中心点
        if(center > 0)
            dfs(i + 1, center - 1, str, stack);
        // 只能不停出栈了
        if(center == 0){
            if(stack.size() > 0 && stack.peek() != ch){
                return;
            }else{
                Character pop_item = stack.pop();
                dfs(i + 1, center, str, stack);
            }
        }else{
            // 1. 对于每一个字符，可以选择pop
            if(stack.size() > 0 && stack.peek() == ch){
                Character pop_item = stack.pop();
                dfs(i + 1, center, str, stack);
                stack.add(pop_item);
            }
            // 2. 也可以选择不pop
            stack.add(ch);
            dfs(i + 1, center, str, stack);
        }
    }
}
/*
abaaca
 */
