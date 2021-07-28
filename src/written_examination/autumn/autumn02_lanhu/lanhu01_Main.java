package written_examination.autumn.autumn02_lanhu;

import java.util.Scanner;

public class lanhu01_Main {
    static int res = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.nextLine();
        String[] proxy_ip = new String[m];
        for(int i = 0; i < m; i++){
            proxy_ip[i] = sc.nextLine();
        }
        int n = sc.nextInt();
        sc.nextLine();
        String[] visit_ip = new String[n];
        for(int i = 0; i < n; i++){
            visit_ip[i] = sc.nextLine();
        }


        dfs(0, 0, proxy_ip, visit_ip, 0);
        if(res == Integer.MAX_VALUE){
            res = -1;
        }
        System.out.println(res);
    }

    private static void dfs(int i, int cur_proxy_idx, String[] proxy_ip, String[] visit_ip, int cur_res) {
        // 访问完最后一个
        if(i == visit_ip.length){
            System.out.println(cur_res);
            res = Math.min(cur_res, res);
            return;
        }
        // 可选队列中选择
        for(int proxy_idx = 0; proxy_idx < proxy_ip.length; proxy_idx++){
            // 如果proxy_ip[proxy_idx] ==  visit_ip[i] , 表示进行不下去
            if(proxy_ip[proxy_idx].equals(visit_ip[i])){
                continue;
            }
            if(proxy_idx == cur_proxy_idx && !proxy_ip[cur_proxy_idx].equals(visit_ip[i])){
                dfs(i+1, proxy_idx, proxy_ip, visit_ip, cur_res);
            }else{
                dfs(i+1, proxy_idx, proxy_ip, visit_ip, cur_res+1);
            }
        }
    }
}
/**
3
166.111.4.100
162.105.131.113
202.112.128.69
6
72.14.235.104
166.111.4.100
207.46.19.190
202.112.128.69
162.105.131.113
118.214.226.52

 return 1
 */