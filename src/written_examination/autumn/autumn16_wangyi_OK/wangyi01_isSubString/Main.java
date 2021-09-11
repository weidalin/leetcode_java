package written_examination.autumn.autumn16_wangyi_OK.wangyi01_isSubString;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/10 9:25 上午
 */

/**
 * 给定两个字符串 s和 t ，判断 s是否为 t 的子序列。
 *
 * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
 *
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 *
 *
 * 输入描述:
 * 共两行，第一行为字符串s,  第二行为字符串t
 *
 *
 * 输出描述:
 * 输出true或者是false，true表示是s是t的子序列，false表示s不是t的子序列
 *
 * 输入例子1:
 * abc
 * ahbgdc
 *
 * 输出例子1:
 * true
 *
 * 输入例子2:
 * axc
 * ahbgdc
 *
 * 输出例子2:
 * false
 */
// ac
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int i = 0, j = 0;
        while(i < str1.length()){
            if(j == str2.length()){
                System.out.println(false);
                return;
            }
            if(str1.charAt(i) == str2.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        System.out.println(true);
    }
}
/*
abc
ahbgdc

axc
ahbgdc
 */