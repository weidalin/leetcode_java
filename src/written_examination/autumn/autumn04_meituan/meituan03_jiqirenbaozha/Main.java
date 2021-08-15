package written_examination.autumn.autumn04_meituan.meituan03_jiqirenbaozha;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static tools.Weida_utils.print_arr;

/**
 * @author linweida
 * 2021/8/15 10:48 上午
 * 小美在数轴上放置了若干个机器人，这些机器人每到整数时刻，就会检查是否和其他机器人重合。如果重合，它就会原地爆炸。
 *
 * 这些机器人的移动速度均为 1 。举例来说，如果一个机器人初始位于点3，然后它的方向是向右的，则时刻1会位于点4，时刻2会位于点5。
 *
 * 小美现在给小团这样一个任务：小美将给出所有机器人的初始位置和初始朝向。小团的任务是判断每个机器人的爆炸时刻。当然，如果有一些机器人永远不会爆炸，则输出-1。
 *
 * 小团向你求助。你能帮帮小团吗？
 *
 * 注意事项1：一个机器人爆炸了之后，就不会再继续存在在这个数轴上。
 *
 * 举例来说，如果有三个机器人，一个位于位置0，向右，一个位于位置2，向右，一个位于位置4，向左。则时刻1的时候，后两个机器人会在位置3相遇并发生爆炸，此后第一个机器人和第三个机器人不会在时刻2继续爆炸（因为此时已经不存在第三个机器人了）
 *
 * 注意事项2：请注意，只有整数时刻机器人才会检查重合。
 *
 * 举例来说，如果有两个机器人，一个位于位置1，向右，一个位于位置2，向左，则它们并不会在整数时刻重合。因此它们两个不存在相遇爆炸。
 *
 * 注意事项3：保证机器人初始时刻不会重叠。换句话说，不存在在时刻0就立刻爆炸的机器人。
 * 输入描述
 * 第一行一个正整数 n 表示有 n 个机器人。
 *
 * 接下来 n 行，每行一个正整数和一个字符，以空格分隔。正整数代表机器人的坐标，字符为大写字母 L 和 R 的其中一个，分别表示机器人向左运动 和 向右运动。
 *
 * 输出描述
 * 输出 n 行，每行一个数字，对应表示每个机器人的答案：
 *
 * 若该机器人会爆炸，输出爆炸时间；若该机器人不会爆炸，输出-1。

 * 提示
 * 数据范围和说明
 *
 * 对于所有数据都保证机器人的坐标处于[1, 1e9]的正整数范围内。
 *
 * 其中，对于30%的数据，保证机器人数量 n <= 10
 *
 * 对于100%的数据，保证机器人数量 n <= 1,000
 */
/*
样例输入
10
94 R
74 L
90 L
75 R
37 R
99 R
62 R
4 L
92 L
44 R
样例输出
-1
6
23
-1
-1
-1
6
-1
-1
23
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int MAX = Integer.MIN_VALUE;
        sc.nextLine();
        int[][] nums = new int[n][2];
        for(int i = 0 ; i < n; i++){
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            nums[i][0] = Integer.parseInt(strs[0]);
            MAX = Math.max(MAX, nums[i][0]);
            nums[i][1] = strs[1].equals("R") ? 1 : -1;
        }

        int[][] res = new int[n][2];
        for(int i = 0; i < MAX / 2 + 1; i++){
            Map<Integer, Integer> map = new HashMap<>();
            for(int j = 0; j < n; j++){
                if(nums[j][1] != 0){
                    nums[j][0] += nums[j][1];
                    if(map.containsKey(nums[j][0])){
                        // 设置两个爆炸的机器人爆炸位置
                        res[j][1] = i;
                        res[map.get(nums[j][0])][1] = i;
                        // 不再更新
                        nums[map.get(nums[j][0])][1] = 0;
                        nums[j][1] = 0;
                        map.remove(nums[j][0]);
                    }
                    // 将当前的位置作为key，下标作为value 放入map中
                    map.put(nums[j][0], j);
                }
            }
        }
        for(int i = 0; i < n; i++){
            res[i][1] = res[i][1] == 0 ? -1 : res[i][1]+1;
            System.out.println(res[i][1]);
        }
    }
}
