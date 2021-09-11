package leetcode.bfs.leetcode815_numBusesToDestination;

import java.util.*;

/**
 * 815. 公交路线
 * 给你一个数组 routes ，表示一系列公交线路，其中每个 routes[i] 表示一条公交线路，第 i 辆公交车将会在上面循环行驶。
 *
 * 例如，路线 routes[0] = [1, 5, 7] 表示第 0 辆公交车会一直按序列 1 -> 5 -> 7 -> 1 -> 5 -> 7 -> 1 -> ... 这样的车站路线行驶。
 * 现在从 source 车站出发（初始时不在公交车上），要前往 target 车站。 期间仅可乘坐公交车。
 *
 * 求出 最少乘坐的公交车数量 。如果不可能到达终点车站，返回 -1 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：routes = [[1,2,7],[3,6,7]], source = 1, target = 6
 * 输出：2
 * 解释：最优策略是先乘坐第一辆公交车到达车站 7 , 然后换乘第二辆公交车到车站 6 。
 * 示例 2：
 *
 * 输入：routes = [[7,12],[4,5,15],[6],[15,19],[9,12,13]], source = 15, target = 12
 * 输出：-1
 */
public class numBusesToDestination_1 {
    static int[][] rs;
    static int s, t;
    public static int numBusesToDestination(int[][] routes, int source, int target) {
        rs = routes; s = source;t = target;
        if(s == t)  return 0;
        int ans = bfs();
        return ans;
    }

    private static int bfs() {
        // 记录某个车站可以进入的路线
        Map<Integer, Set<Integer>> map = new HashMap<>();
        // 经过的路线
        Deque<Integer> d = new ArrayDeque<>();
        // 进入该路径使用的距离
        Map<Integer, Integer> m = new HashMap<>();
        int n = rs.length;
        for(int i = 0; i < n; i++){
            for(int station : rs[i]){
                if(station == s){
                    d.addLast(i);
                    m.put(i, 1);
                }
                Set<Integer> set = map.getOrDefault(station, new HashSet<>());
                set.add(i);
                map.put(station, set);
            }
        }
        while(!d.isEmpty()) {
            int poll = d.pollFirst();
            int step = m.get(poll);
            for(int station : rs[poll]) {
                if (station == t) return step;
                Set<Integer> lines = map.get(station);
                if(lines == null)   continue;
                for(int nr : lines) {
                    if (!m.containsKey(nr)){
                        m.put(nr, step + 1);
                        d.add(nr);
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] routes = new int[][]{{1,2,7},{3,6,7}};
        int source = 1, target = 6;
        int res = numBusesToDestination(routes, source, target);
        System.out.println(res);
    }
}
