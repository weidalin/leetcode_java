package test;

public class aaa {
    作者：我没拿98k
    链接：https://www.nowcoder.com/discuss/756757?type=all&order=time&pos=&page=1&ncTraceId=&channel=-1&source_id=search_all_nctrack
    来源：牛客网

    public boolean[] pathAvailable (int[][] matrix, int[][] starts, int[][] ends) {
        // write code here
        boolean ans[]=new boolean[starts.length];
        boolean f[][]=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<starts.length;++i){
            ans[i]=dfs(starts[i][0],starts[i][1],ends[i][0],ends[i][1],matrix,f);
        }
        return ans;
    }

    private boolean dfs(int i, int i1, int i2, int i3,int [][]matrix, boolean[][] f) {
        if(i==i2&&i1==i3){
            return true;
        }
        if(i<0||i>=f.length||i1>=f[0].length||i1<0){
            return false;
        }
        f[i][i1]=true;//走过了
        int depth[][]=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        boolean tmp[]=new boolean[4];
        for(int j=0;j<depth.length;++j){
            int a=i+depth[j][0];
            int b=i1+depth[j][1];
            if(a>=0&&a<f.length&&
                    b>=0&&b<f[0].length&&
                    !f[a][b]
                    &&matrix[a][b]==1){//没走过且可以走
                //f[a][b]=true;
                tmp[j]=dfs(a,b,i2,i3,matrix,f);
            }
        }
        f[i][i1]=false;
        return tmp[0]||tmp[1]||tmp[2]||tmp[3];
    }
}
