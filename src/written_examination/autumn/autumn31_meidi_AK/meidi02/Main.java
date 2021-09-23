package written_examination.autumn.autumn31_meidi_AK.meidi02;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linweida
 * 2021/9/23 10:39 上午
 */

class Point {
    int x;
    int y;
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
 }
public class Main {
    public int maxPointsNum (Point[] points) {
        // write code here
        int n = points.length;
        if(n <= 2)  return n;
        int res = 0;
        for(int i = 0; i < n; i++){
            if(res >= n - i || res > n / 2) break;
            Map<Integer, Integer> map = new HashMap<>();
            for(int j = i + 1; j < n; j++){
                int x = points[i].x - points[j].x;
                int y = points[i].y - points[j].y;
                if(x == 0){
                    y = 1;
                }else if(y == 0){
                    x = 1;
                }else{
                    if(y < 0){
                        x = -x;
                        y = -y;
                    }
                    int getGCD = gcd(x, y);
                    x /= getGCD;
                    y /= getGCD;
                }
                int key = y + x * 20001;
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            int maxn = 0;
            for(Integer key : map.keySet()){
                int curNum = map.get(key);
                maxn = Math.max(maxn, curNum + 1);
            }
            res = Math.max(res, maxn);
        }
        return res;
    }

    private int gcd(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        return y != 0 ? gcd(y, x % y) : x;
    }
}
