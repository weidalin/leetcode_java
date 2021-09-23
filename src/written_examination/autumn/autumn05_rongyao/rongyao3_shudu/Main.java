package written_examination.autumn.autumn05_rongyao.rongyao3_shudu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static tools.Weida_utils.print_arr;

/**
 * @author linweida
 * 2021/8/21 8:09 下午
 */

public class Main {
    static boolean[][] line = new boolean[9][9];
    static boolean[][] column = new boolean[9][9];
    static boolean[][][] block = new boolean[3][3][9];
    static boolean valid = false;
    static List<int[]> space = new ArrayList<int[]>();
    static int[][] nums = new int[9][9];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 9; i++){
            String str = sc.nextLine();
            str = str.substring(1, str.length()-1);
            String[] strlist = str.split(",");
            for(int j = 0; j < strlist.length; j++){
                nums[i][j] = Integer.valueOf(strlist[j]);
            }
        }
        solveSudu(nums);
    }

    public static void solveSudu(int[][] board) {
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == 0){
                    space.add(new int[]{i,j});
                }else{
                    int digit = board[i][j] - 1;
                    line[i][digit] = column[j][digit] = block[i/3][j/3][digit]=true;
                }
            }
        }
        dfs(board, 0);
        for(int i = 0; i < 9; i++){
            String res = "{";
            for(int j = 0; j < 9; j++){
                res += board[i][j] + ",";
            }
            res = res.substring(0, res.length()-1);
            res += "}";
            System.out.println(res);
        }
    }

    private static void dfs(int[][] board, int pos) {
        if(pos == space.size()){
            valid = true;
            return;
        }
        int[] spa = space.get(pos);
        int i = spa[0], j = spa[1];
        for(int digit = 0; digit < 9 && !valid; digit++){
            if(!line[i][digit] && !column[j][digit] && !block[i/3][j/3][digit]){
                line[i][digit] = column[j][digit] = block[i/3][j/3][digit] = true;
                board[i][j] = digit + 1;
                dfs(board, pos + 1);
                line[i][digit] = column[j][digit] = block[i/3][j/3][digit] = false;
            }
        }
    }
}
/*
{5,0,0,6,0,2,0,0,0}
{0,0,8,0,7,0,2,0,0}
{7,0,0,8,1,0,5,4,6}
{2,0,1,3,0,0,9,8,5}
{3,4,0,0,8,0,0,0,0}
{0,0,9,0,0,7,0,1,4}
{1,5,6,0,2,0,0,0,3}
{4,0,2,0,9,6,0,0,7}
{9,0,0,0,0,3,0,0,1}
 */
