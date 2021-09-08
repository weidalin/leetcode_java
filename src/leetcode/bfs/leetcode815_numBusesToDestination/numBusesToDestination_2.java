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
public class numBusesToDestination_2 {
    static int N = (int)1e6+10;
    static int[] p = new int[N];
    int find(int x) {
        if (p[x] != x) p[x] = find(p[x]);
        return p[x];
    }
    void union(int a, int b) {
        p[find(a)] = p[find(b)];
    }
    boolean query(int a, int b) {
        return find(a) == find(b);
    }
    int s, t;
    int[][] rs;
    public int numBusesToDestination(int[][] _rs, int _s, int _t) {
        rs = _rs; s = _s; t = _t;
        if (s == t) return 0;
        for (int i = 0; i < N; i++) p[i] = i;
        for (int[] r : rs) {
            for (int loc : r) {
                union(loc, r[0]);
            }
        }
        if (!query(s, t)) return -1;
        int ans = bfs();
        return ans;
    }
    // 记录某个车站可以进入的路线
    Map<Integer, Set<Integer>> map = new HashMap<>();
    int bfs() {
        Deque<Integer> d1 = new ArrayDeque<>(), d2 = new ArrayDeque<>();
        Map<Integer, Integer> m1 = new HashMap<>(), m2 = new HashMap<>();

        int n = rs.length;
        for (int i = 0; i < n; i++) {
            for (int station : rs[i]) {
                // 将从起点可以进入的路线加入正向队列
                if (station == s) {
                    d1.addLast(i);
                    m1.put(i, 1);
                }
                // 将从终点可以进入的路线加入反向队列
                if (station == t) {
                    d2.addLast(i);
                    m2.put(i, 1);
                }
                Set<Integer> set = map.getOrDefault(station, new HashSet<>());
                set.add(i);
                map.put(station, set);
            }
        }

        // 如果「起点所发起的路线」和「终点所发起的路线」有交集，直接返回 1
        Set<Integer> s1 = map.get(s), s2 = map.get(t);
        Set<Integer> tot = new HashSet<>();
        tot.addAll(s1);
        tot.retainAll(s2);
        if (!tot.isEmpty()) return 1;

        // 双向 BFS
        while (!d1.isEmpty() && !d2.isEmpty()) {
            int res = -1;
            if (d1.size() <= d2.size()) {
                res = update(d1, m1, m2);
            } else {
                res = update(d2, m2, m1);
            }
            if (res != -1) return res;
        }

        return 0x3f3f3f3f; // never
    }
    int update(Deque<Integer> d, Map<Integer, Integer> cur, Map<Integer, Integer> other) {
        // 取出当前所在的路线，与进入该路线所花费的距离
        int poll = d.pollFirst();
        int step = cur.get(poll);

        // 遍历该路线所包含的车站
        for (int station : rs[poll]) {
            // 遍历将由该线路的车站发起的路线
            Set<Integer> lines = map.get(station);
            if (lines == null) continue;
            for (int nr : lines) {
                if (cur.containsKey(nr)) continue;
                if (other.containsKey(nr)) return step + other.get(nr);
                cur.put(nr, step + 1);
                d.add(nr);
            }
        }

        return -1;
    }
}
