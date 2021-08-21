package written_examination.autumn.autumn04_meituan.else_test;

public class ntree {
    public static int numTrees (int n) {
        if(n==0){
            return 1;
        }
        int[] f = new int[n+1];
        f[0]=1; //节点为1时，能构成一个

        for(int i=1;i<=n;i++){//依次设置f[i]的值，直到f[n]为止
            for(int root=1;root<=i;root++){//i个节点时，针对不同的根节点，可构建的不同的BST数
                f[i]+= f[root-1]*f[i-root]; // i为根节点时，可构建的BST数为：可构建的不同的左子树*可构建的不同的右子树
            }
        }//for
        return f[n];
    }

    public static void main(String[] args) {
        int res = numTrees(3);
        System.out.println(res);
    }
}
