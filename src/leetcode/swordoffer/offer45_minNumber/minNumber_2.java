package leetcode.swordoffer.offer45_minNumber;

/**
 * 剑指 Offer 45. 把数组排成最小的数
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *
 * 示例 1:
 *
 * 输入: [10,2]
 * 输出: "102"
 * 示例 2:
 *
 * 输入: [3,30,34,5,9]
 * 输出: "3033459"
 *
 * 提示:
 *
 * 0 < nums.length <= 100
 * 说明:
 *
 * 输出结果可能非常大，所以你需要返回一个字符串而不是整数
 * 拼接起来的数字可能会有前导 0，最后结果不需要去掉前导 0
 */
public class minNumber_2 {
    //1.dfs遍历所有
    static String res = "-1";
    static boolean[] nums_help;
    public static String minNumber(int[] nums) {
        if(nums.length == 0){
            return "";
        }
        nums_help = new boolean[nums.length];
        dfs(nums, 0, "");
        return res;
    }

    private static void dfs(int[] nums, int idx, String str) {
        if(idx == nums.length){
            if(str.compareTo(res) < 0 || res.equals("-1") ){
                res = str;
            }
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums_help[i] != true){
                nums_help[i] = true;
                dfs(nums, idx + 1, str + nums[i]);
                nums_help[i] = false;
            }
        }
    }
}
