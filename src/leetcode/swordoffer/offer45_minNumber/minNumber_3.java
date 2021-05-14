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
public class minNumber_3 {
    public static String minNumber(int[] nums) {
        String[] str = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            str[i] = Integer.toString(nums[i]);
        }
        quickSort(str, 0, nums.length - 1);
        StringBuilder sb = new StringBuilder();
        for(String s : str){
            sb.append(s);
        }
        return sb.toString();
    }

    private static void quickSort(String[] str, int left, int right) {
        if(left >= right){
            return;
        }
        int i = left, j = right;
        String poiv = str[left];
        while(i < j){
            while((poiv + str[j]).compareTo(str[j] + poiv) <= 0 && i < j){
                j--;
            }
            while((poiv + str[i]).compareTo(str[i] + poiv) >= 0 && i < j){ //should befor
                i++;
            }
            swap(str, i, j);
        }
        str[left] = str[j];
        str[j] = poiv;
        quickSort(str, left, j - 1);
        quickSort(str, j + 1, right);
    }

    private static void swap(String[] str, int i, int j) {
        String tmp = str[i];
        str[i] = str[j];
        str[j] = tmp;
    }
}
/**
 * 执行用时：
 * 5 ms
 * , 在所有 Java 提交中击败了
 * 97.27%
 * 的用户
 * 内存消耗：
 * 38.1 MB
 * , 在所有 Java 提交中击败了
 * 53.15%
 * 的用户
 */
/**
 * 时间复杂度 O(N \log N)O(NlogN) ： NN 为最终返回值的字符数量（ strsstrs 列表的长度 \leq N≤N ）；使用快排或内置函数的平均时间复杂度为 O(N \log N)O(NlogN) ，最差为 O(N^2)O(N
 * 2
 *  ) 。
 * 空间复杂度 O(N)O(N) ： 字符串列表 strsstrs 占用线性大小的额外空间
 *
 * 作者：jyd
 * 链接：https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/solution/mian-shi-ti-45-ba-shu-zu-pai-cheng-zui-xiao-de-s-4/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
