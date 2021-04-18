package written_examination.meituan.soilder;

import java.util.Scanner;

/**
 * 小美的玩具士兵
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 小美有一些玩具士兵。这天小团来到小美家一起玩耍，小美决定将玩具士兵分为两拨，一拨自己留着，一拨给小团。不妨标记小美拿到的是玩具兵团A，小团是玩具兵团B。
 *
 * 每支兵团下面会率领许多小队，每支小队有队伍中的玩具兵人数和每个兵的战斗力。就样例而言，小美的兵团A有3支小队，第一支小队是战斗力为1的兵3个，第二支小队是战斗力为4的兵3个，第三支小队是战斗力为2的兵6个。
 *
 * 由于小美和小团使用的玩具战场条件较为恶劣，这场地图约定战斗力必须大于等于k的玩具兵才能上场，因此，小美和小团只会派双方战斗力大于等于k的玩具兵参加战斗。
 *
 * 通常情况下，我们会预测战斗力之和高的队伍获胜。现在给出你两支玩具兵团所率领的小队的人数和战斗力，要求你输出两支玩具兵团能够派出的玩具兵的战斗力总和，并请你预测获胜方是谁。
 *
 * 数据保证两支玩具兵团战斗力之和不相同。换句话说，一定能分出胜负。
 *
 *
 *
 * 输入描述
 * 第一行三个正整数n, m, k，其中n代表玩具兵团A的小队数量，m代表玩具兵团B的小队数量，k代表战场要求的战斗力最低值。
 *
 * 接下来n行，每行两个正整数x,y，表示玩具兵团A的其中一支小队有x个战斗力为y的玩具兵。
 *
 * 接下来m行，每行两个正整数x,y，表示玩具兵团B的其中一支小队有x个战斗力为y的玩具兵。
 *
 * 1 <= n, m <= 1000, 1 <= k <= 1000, 1 <= x, y <= 1e9
 *
 * 输出描述
 * 两行。
 *
 * 第一行两个正整数，以空格分隔，分别表示小美能派出的战斗力总和，小团能派出的战斗力总和。
 *
 * 第二行一个字符A或者B表示获胜方是小美还是小团。若小美获胜则输出A，反之则B。
 *
 *
 * 样例输入
 * 3 4 3
 * 3 1
 * 3 4
 * 6 2
 * 2 4
 * 3 1
 * 1 5
 * 4 2
 * 样例输出
 * 12 13
 * B
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        int[] soilders_A_index = new int[n];
        int[] soilders_A = new int[n];
        int[] soilders_B_index = new int[m];
        int[] soilders_B = new int[m];
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            soilders_A_index[i] = x;
            soilders_A[i] = y;
        }
        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            soilders_B_index[i] = x;
            soilders_B[i] = y;
        }

        //countA
        int power_A = 0;
        for(int i = 0; i < n; i++){
            if(soilders_A[i] >= k){
                power_A += soilders_A[i] * soilders_A_index[i];
            }
        }
        //countA
        int power_B = 0;
        for(int i = 0; i < n; i++){
            if(soilders_B[i] >= k){
                power_B += soilders_B[i] * soilders_B_index[i];
            }
        }
        System.out.println(power_A + " " + power_B);
        String res = power_A > power_B ? "A" : "B";
        System.out.print(res);
    }
}
