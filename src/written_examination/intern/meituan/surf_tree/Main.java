package written_examination.intern.meituan.surf_tree;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 小美的树上冲浪
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 现在，小美的面前是一棵二叉树。
 *
 * 小美从根节点开始向下冲浪。小美所乘坐的船上将有一个计数器，每个树上的节点都会有一个临界值，当小美船上的计数器大于等于临界值时，小美将被推往右侧节点，否则将被推往左侧节点。这样，小美就会逐渐地冲浪下去，一直到叶子节点。
 *
 * 由于计数器上的值如果不发生变更，小美将会一直冲浪同一个路线，那就实在是太过无聊了。
 *
 * 所以小美每次都会变更自己所乘坐的船上的计数器的值，变更之后从根节点向下冲浪。
 *
 * 那么，你很容易就可以发现，有一些节点是无论如何也无法冲浪到的。你的任务是找出这个二叉树上有多少个，不管小美如何变更自己所乘坐的船的计数器，也无法冲浪到的节点数量。
 *
 * 样例解释
 *
 * 样例中是节点6始终无法抵达，其他节点均有办法在初始时修改计数器的值抵达。
 *
 * 1<= n <= 10000，恒有n = 2 * m + 1。每个节点的临界值范围在[1, 1e9]之间。
 *
 * 小美的计数器可以置于[1, 1e9]之间的任意值。
 *
 *
 *
 * 输入描述
 * 第一行三个正整数n和m和k，表示有n个节点编号从1到n，并将给出m个节点关系，根节点编号是k。
 *
 * 接下来有m行，每行三个正整数t和x和y，表示t的左儿子节点是x，右儿子节点是y。保证可以用这m个关系构建出n个点且以k为根的树。
 *
 * 接下来给出一行n个正整数，以空格分隔，分别代表每个节点的临界值。
 *
 * 输出描述
 * 一行一个正整数表示不能冲浪到的节点数量。
 *
 *
 * 样例输入
 * 7 3 1
 * 1 2 3
 * 2 4 5
 * 3 6 7
 * 10 5 5 10 5 5 10
 * 样例输出
 * 1
 */
class TreeNode {
    public int val;
    // 以该节点为根的树的节点总数
    public int size;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }
    public TreeNode(int val) {
        this.val = val;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        int[][] matrix = new int[n+1][2];

        for(int i = 0; i <= n; i++) {
            Arrays.fill(matrix[i], 0);
        }
        for(int i = 0; i < m; i++){
            int t = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
            matrix[t] = new int[]{x, y};
        }
        int[] matrix_value = new int[n+1];
        for(int i = 1; i<=n; i++){
            matrix_value[i] = sc.nextInt();
        }
        TreeNode root = build_tree(matrix, matrix_value,k);
        int res  = count(root, 1, n);
        System.out.println(res);
    }

    private static int count(TreeNode root, int left, int right) {
        if(root == null){
            return 0;
        }
        if(root.val < left || root.val > right){
            return count_subtree(root);
        }

        int left_right = Math.min(right, root.val);
        int right_left = Math.max(right, root.val);
        return count(root.left, left, left_right) + count(root.right, right_left, right);
    }

    private static int count_subtree(TreeNode root) {
        if(root != null){
            return 1;
        }
        return 1 + count_subtree(root.left) + count_subtree(root.right);
    }

    private static TreeNode build_tree(int[][] matrix, int[] matrix_value, int k) {
        TreeNode root = new TreeNode(matrix_value[k]);
        if(matrix[k][0] != 0){
            TreeNode left = build_tree(matrix, matrix_value, matrix[k][0]);
            TreeNode right = build_tree(matrix, matrix_value, matrix[k][1]);
            root.left = left;
            root.right = right;
            return root;
        }else{
            return null;
        }
    }
}
