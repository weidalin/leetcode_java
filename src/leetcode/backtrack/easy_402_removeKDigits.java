package src.leetcode.backtrack;

import static java.lang.Integer.parseInt;

/**
 * 402. 移掉K位数字
 * 给定一个以字符串表示的非负整数 num，移除这个数中的 k 位数字，使得剩下的数字最小。
 *
 * 注意:
 *
 * num 的长度小于 10002 且 ≥ k。
 * num 不会包含任何前导零。
 * 示例 1 :
 *
 * 输入: num = "1432219", k = 3
 * 输出: "1219"
 * 解释: 移除掉三个数字 4, 3, 和 2 形成一个新的最小的数字 1219。
 */
public class easy_402_removeKDigits {
    public static String removeKdigits(String num, int k) {
        String res = num;
        backTrack(num, k, res, 0);
        return res;
    }

    private static void backTrack(String num, int k, String res,int start) {
        String tmp = "";
        if (num.length()==0 || k<0)
            return;
        if (Integer.parseInt(num) < Integer.parseInt(res))
            res = num;

        for (int i=start+1; i<num.length(); i++) {
            //1.choose
            tmp = num;
            num = num.substring(0, i) + num.substring(i + 1);
            //2.explore
            backTrack(num, k - 1, res, i);
            //3.remove
            num = tmp;
        }
        System.out.println(res);
    }

    public static void main(String[] args){
        String num = "1432219";int k = 3;
        String res = removeKdigits(num, k);
        System.out.println("final:"+res);
    }
}
