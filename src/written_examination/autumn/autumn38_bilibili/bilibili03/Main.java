package written_examination.autumn.autumn38_bilibili.bilibili03;

import java.util.*;

import static tools.Weida_utils.print_arr;

/**
 * @author linweida
 * 2021/10/13 8:00 下午
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int me = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums = new int[m][2];
        sc.nextLine();

        HashMap<Integer, Set> map = new HashMap<Integer, Set>();
        for(int i = 0; i < m; i++){
            String[] str = sc.nextLine().split(",");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            Set<Integer> xKnown = map.getOrDefault(x, new HashSet<Integer>());
            Set<Integer> yKnown = map.getOrDefault(y, new HashSet<Integer>());
            xKnown.add(y);
            yKnown.add(x);
            map.put(x, xKnown);
            map.put(y, yKnown);
        }
        Set<Integer> myfriends = map.getOrDefault(me, new HashSet());
        int originKnown = myfriends.size();
        Queue<Integer> myfriendsQueue = new LinkedList<>();
        myfriendsQueue.addAll(myfriends);
        while(!myfriendsQueue.isEmpty()){
            int size = myfriendsQueue.size();
            for(int i = 0; i < size; i++){
                int myfriend = myfriendsQueue.poll();
                Set<Integer> myfrifri = map.getOrDefault(myfriend, new HashSet());
                myfriends.addAll(myfrifri);
                myfriendsQueue.addAll(myfrifri);
                map.remove(myfriend);
            }
        }

        System.out.println(myfriends.size() - originKnown);




    }

    public static void union(int[] parent, int idx1, int idx2){
        parent[find(parent, idx1)] = find(parent, idx2);
    }
    public static int find(int[] parent, int idx){
        while(parent[idx] != idx){
            parent[idx] = parent[parent[idx]];
            idx = parent[idx];
        }
        return idx;
    }
}
/*
7
5
6
1,0
3,1
4,1
5,3
6,1
6,5
 */
