package leetcode.backtrack.leetcode402_removeKdigits;

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
 * 示例 2 :
 *
 * 输入: num = "10200", k = 1
 * 输出: "200"
 * 解释: 移掉首位的 1 剩下的数字为 200. 注意输出不能有任何前导零。
 * 示例 3 :
 *
 * 输入: num = "10", k = 2
 * 输出: "0"
 * 解释: 从原数字移除所有的数字，剩余为空就是0。
 */
public class RemoveKdigits_1 {
    static String res;
    public static String removeKdigits(String num, int k) {
        res = num;
        dfs(num, 0, k);

        return res;
    }

    private static void dfs(String nums, int i, int k) {
        if(k == 0 || nums.length() == 0 || i >= nums.length()){
            return;
        }
        String tmp = nums;
        //1.选择删除下标i
        nums = nums.substring(0, i) + nums.substring(i + 1, nums.length());
//        System.out.println(i + " : nums: " + nums);
        if(nums.length() == 0){
            nums = "0";
        }
        if(Integer.parseInt(nums) < Integer.parseInt(res)){
            res = String.valueOf(Integer.parseInt(nums));
        }
        //2.dfs
        dfs(nums, i, k - 1);
        //3.回溯
        dfs(tmp, i + 1, k);
    }

    public static void main(String[] args){
        String num = "1432219";int k = 3;
        String res = removeKdigits(num, k);
        System.out.println("final:"+res);
    }
}
