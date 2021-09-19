package leetcode.treeTravel;

/**
 * @author linweida
 * 2021/9/18 5:00 下午
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Xiong YuSong
 * 2019/3/22 17:04
 */
class Edge implements Comparable<Edge> {
    //起始点
    private int begin;
    //终止点
    private int end;
    //权值
    private int weight;

    public Edge(int begin, int end, int weight) {
        this.begin = begin;
        this.end = end;
        this.weight = weight;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        if (o.weight > this.weight) {
            return -1;
        } else {
            return 1;
        }
    }
}

public class Kruskal {

    public static void main(String[] args) {
        //默认以a为根节点的最小生成树
        List<Edge> list = new ArrayList<>();
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
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][j] > 0) {
                    list.add(new Edge(i, j, arr[i][j]));
                }
            }
        }
        Collections.sort(list);
        //数组中每一个节点都只知道他的父节点是什么，-1表示不存在父节点，0位置是根节点
        int[] parent = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            parent[i] = -1;
        }
        int m = 0, n = 0;
        for (Edge edge : list) {
            //寻找这两个点有没有相同的父节点
            m = find(parent, edge.getBegin());
            n = find(parent, edge.getEnd());
            if (m != n && parent[edge.getEnd()]>0) {
                parent[edge.getEnd()] = edge.getBegin();
            }
        }
        System.out.println(Arrays.toString(parent));
    }

    private static int find(int[] parent, int ch) {
        while (parent[ch] > 0) {
            ch = parent[ch];
        }
        return ch;
    }
}
