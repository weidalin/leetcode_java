package written_examination.autumn.autumn14_meituan.meituan02_bus;

import java.util.List;

/**
 * @author linweida
 * 2021/9/5 12:10 上午
 */

/**
 * 题目描述
 * 小美想坐公交去找小团玩，美团市中共有n个公交站，编号为1到n。同时也有m条公交线路，编号为1到m。小美想知道对于每一对公交站(i，j)从编号为i的站坐公交到编号为j的站至少需要乘坐几条不同的公交线路。
 *
 * 输入描述
 *
 * 第一行有两个空格隔开的整数n，m(1<=n<=500，1<=m<=500且1<=n+m<=500)，代表公交站的个数和公交线路的条数。接下来n行。每一行开头有一个整数k(1<=k<=m)。代表从这个站可以乘坐k条不同的公交线路。接下来有k个整数，代表这k条公交线路的编号，数字间用空格隔开。
 *
 * 输出描述
 *
 * 输出一个nxn的炮车，矩阵中第i行第j列的数代表从编号为i的站坐到编号为j的站至小需要乘坐多少条不同的公交线路，矩阵中每行中的元素由单个空格隔开，且行末不能有空格。
 */

public class Main {
    int N = Integer.MAX_VALUE;
    long MOD = 998244353;

    public static void main(String[] args) {

    }
}
/*
#include <bits/stdc++.h>
using namespace std;
typedef long long LL;
const int N = 5e2+ 50;
const LL MOD = 998244353;
LL dp[N][2][2];
int f[N][N];
vector<int> e[N];
int main() {
    int n, m; cin >> n >> m;
    memset(f, 63, sizeof f);
    int limit = f[0][0];
    for(int i = 1; i <= n; i++) {
        f[i][i] = 0;
        int k; cin >> k;
        while(k--) {
            int x; cin >> x;
            e[x].push_back(i);
        }
    }
    for(int i = 1; i < N; i++){
        for(int j = 0; j < e[i].size(); j++) {
            for(int k = 0; k < e[i].size(); k++) {
                int S = e[i][j];
                int T = e[i][k];
                f[S][T] = f[T][S] = min(f[S][T], 1);
            }
        }
    }

    for(int k = 1; k <= n; k++) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                f[i][j] = min(f[i][j], f[i][k] + f[k][j]);
            }
        }
    }
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= n; j++) {
            if(f[i][j] == limit) {
                f[i][j] = -1;
            }
            cout << f[i][j];
            if(j != n) {
                cout << ' ';
            }
        }
        cout << "\n";
    }
    return 0;
}
 */
