package written_examination.autumn.autumn28_wanmeishijie.wanmei01;

import java.util.Arrays;
/**
 * @author linweida
 * 2021/9/18 4:51 下午
 */


public class Prim {
    //表示不能互互通的顶点之间的距离
    private static final int MAX = 10000;
    public static void main(String[] args) {
        char []data={'A','B','C','D','E'};
        //构建顶点之间的距离
        int [][]weight={{MAX,MAX,7,5,10},{MAX,MAX,12,9,4},
                {7,12,MAX,MAX,6},{5,9,MAX,MAX,MAX},{10,4,6,MAX,MAX}};
        Graph graph = new Graph(data.length);
        MinTree.setGraph(graph, data.length, data, weight);
        MinTree.showGraph(graph);
        MinTree.minPath(graph,0);
    }

}

class MinTree {
    //构建图
    public static void setGraph(Graph graph, int verxs, char[] data, int[][] weight) {
        for (int i = 0; i < verxs; i++) {
            graph.data[i]=data[i];
            for (int j = 0; j < verxs; j++) {
                graph.weight[i][j]=weight[i][j];
            }
        }
    }

    //构建最优修路路径
    //v代表从哪个顶点开始修
    public static void minPath(Graph graph,int v) {
        //用于记录哪些顶点已经被选过了
        int []visited=new int[graph.verxs];
        //表示V被选过了
        visited[v]=1;
        //表示n个顶点需要n-1条边
        for (int i = 1; i < graph.verxs; i++) {
            //最小路径
            int minPath= 10000;
            int h1=-1;//用于记录最小路劲对应的已选择过顶点的下标
            int h2=-1;//用于记录最小路劲对应的未选择过顶点的下标
            //用来每次选取距离已被选过的边这个集体最近的边,并确定路径
            for (int j = 0; j < graph.verxs; j++) {
                for (int k = 0; k < graph.verxs; k++) {
                    if (visited[j]==1 && visited[k]==0 && graph.weight[j][k]<minPath ) {
                        minPath=graph.weight[j][k];
                        h1=j;
                        h2=k;
                    }
                }
            }
            System.out.println("已选择顶点中" + graph.data[h1] + "与未选择顶点中"
                    + graph.data[h2] + "相连权值为" + graph.weight[h1][h2]);
            visited[h2]=1;
        }
    }

    //打印图
    public static void showGraph(Graph graph) {
        for (int[] w : graph.weight) {
            System.out.println(Arrays.toString(w));
        }
    }
}

class Graph {
    public int verxs=0;//顶点数
    public char []data;//顶点数据
    public int [][]weight;//表示图之间的边

    public Graph(int verxs) {
        this.verxs = verxs;
        data=new char[verxs];
        weight=new int[verxs][verxs];
    }
}


