package newcode.sort.getLeastNumbers;

import java.util.ArrayList;

import static tools.Weida_utils.swap;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/6a296eb82cf844ca8539b57c23e6e9bf?orderByHotValue=1&mutiTagIds=590&page=1&onlyReference=false
 * 来源：牛客网
 *
 * 编程题]最小的K个数
 * 热度指数：940863时间限制：C/C++ 1秒，其他语言2秒空间限制：C/C++ 64M，其他语言128M
 * 算法知识视频讲解
 * 给定一个数组，找出其中最小的K个数。例如数组元素是4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。如果K>数组的长度，那么返回一个空的数组
 * 示例1
 * 输入
 * [4,5,1,6,2,7,3,8],4
 * 输出
 * [1,2,3,4]
 *
 */
public class GetLeastNumbers_Solution_2 {
    //1.选择排序
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (k > input.length)
            return res;
        for(int i = 0; i < k; i++){
            int min_index = i;
            int min = input[i];
            for(int j = i; j < input.length; j++){
                if (input[j] <= min){
                    min_index = j;
                    min = input[j];
                }
            }
            swap(input, i, min_index);
            res.add(input[i]);
        }
        return res;
    }
    /**
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
     */
}
