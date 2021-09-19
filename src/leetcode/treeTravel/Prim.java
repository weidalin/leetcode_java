package leetcode.treeTravel;

/**
 * @author linweida
 * 2021/9/18 5:00 下午
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 普里姆（Prim）算法
 *
 * @author Xiong YuSong
 * 2019/3/22 16:02
 */
public class Prim {

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {-1, 4, 0, 0, 0, 0, 0, 8, 0},
                {0, -1, 8, 0, 0, 0, 0, 11, 0},
                {0, 0, -1, 7, 0, 4, 0, 0, 2},
                {0, 0, 0, -1, 9, 14, 0, 0, 0},
                {0, 0, 0, 0, -1, 10, 0, 0, 0},
                {0, 0, 0, 0, 0, -1, 2, 0, 0},
                {0, 0, 0, 0, 0, 0, -1, 1, 6},
                {0, 0, 0, 0, 0, 0, 0, -1, 7},
                {0, 0, 0, 0, 0, 0, 0, 0, -1}
        };
        List<Integer> list = new ArrayList<>();
        //先将0放置在list中
        list.add(0);
        int begin = 0, end = 0, weight;
        int[] parent = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            parent[i] = -1;
        }
        while (list.size() < arr.length) {
            weight = Integer.MAX_VALUE;
            for (Integer row : list) {
                for (int i = 0; i < arr.length; i++) {
                    if (!list.contains(i)) {
                        if (i >= row + 1) {
                            if (arr[row][i] > 0 && arr[row][i] < weight) {
                                begin = row;
                                end = i;
                                weight = arr[row][i];
                            }
                        } else if (i <= row - 1) {
                            //我这里只用了上三角矩阵，所以这里需要画蛇添足写这一部分
                            if (arr[i][row] > 0 && arr[i][row] < weight) {
                                begin = row;
                                end = i;
                                weight = arr[i][row];
                            }
                        }
                    }
                }
            }
            list.add(end);
            parent[end] = begin;
        }
        System.out.println(Arrays.toString(parent));
    }
}
