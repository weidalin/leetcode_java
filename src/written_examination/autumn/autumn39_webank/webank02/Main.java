package written_examination.autumn.autumn39_webank.webank02;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/10/14 3:05 下午
 */
/*
    一台机甲在一个二维空间里移动，它的移动受到一串事先写好的指令的控制，每条指令会让它往特定方向移动一格。该空间为矩形，四周都是墙壁，无法通过，空间中每个格子位置的阻力不同，我们用一个数值来表示它的阻力，还有一些格子存在障碍无法通过。机器人每走一格，需要消耗能量，能量数为走之前和走之后位置的阻力数值中较大的那个数。当它的方向改变时，消耗能量 x，当它走向墙壁或者障碍物时，会停在原地并消耗能量 y（如果需要，仍会先改变方向）。一开始它位于整个空间的左上角，第一步移动不需要花能量改变方向，请计算它最后总共消耗了多少能量。



输入描述
    第一行四个整数 n, m, x, y，（0 < n, m <= 100，1 <= x, y <= 100000）

    后面 n 行，每行 m 个数，形成一个方阵，表示各个格子位置的阻力数值，如果为 -1，表示该位置无法通过。各个位置的数值范围为 [-1, 100000]。

    最后一行一个字符串，由 hjkl 四种字母组成，表示指令序列。h 表示向左移动一格，j 表示向下移动一格，k 表示向上移动一格，l 表示向右移动一格。字符串长度不超过 100000。

输出描述
一个整数，表示消耗的总能量。


样例输入
2 2 2 2
1 2
-1 3
kjljk
样例输出
20
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] nums = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        sc.nextLine();
        String str = sc.nextLine();
        int consume = 0;
        int i = 0, j = 0;
        int prei = 0, prej = 0;
        int preDirection = 0;
        for(char ch : str.toCharArray()){
            prei = i;
            prej = j;
            if(ch == 'h'){ // 左
                i--;
                if(preDirection != 0 && preDirection != 1){
                    consume += x;
                    preDirection = 1;
                }
                if(i == -1 || i > -1 && nums[i][j] == -1){
                    consume += y;
                    i++;
                    continue;
                }

            }
            if(ch == 'l'){ // 右
                i++;
                if(preDirection != 0 && preDirection != 2){
                    consume += x;
                    preDirection = 2;
                }
                if(i == n || i < n && nums[i][j] == -1){
                    consume += y;
                    i--;
                    continue;
                }

            }
            if(ch == 'j'){ // 下
                j++;
                if(preDirection != 0 && preDirection != 3){
                    consume += x;
                    preDirection = 3;
                }
                if(j == n || j < n && nums[i][j] == -1){
                    consume += y;
                    j--;
                    continue;
                }

            }
            if(ch == 'k'){ // 上
                j--;
                if(preDirection != 0 && preDirection != 4){
                    consume += x;
                    preDirection = 4;
                }
                if(j == -1 || j >= 0 && nums[i][j] == -1){
                    consume += y;
                    j++;
                    continue;
                }

            }

            consume += Math.max(nums[prei][prej], nums[i][j]);
        }
        System.out.println(consume);
    }
}
/*
2 2 2 2
1 2
-1 3
kjljk
 */