package written_examination.autumn.autumn11_shenxinfu.shenxinfu03_guizeyinqing;

/**
 * @author linweida
 * 2021/8/31 4:40 下午
 */

//<p>第一行输入一个正整数N表示规则树中节点的数目。</p>
//<p>接下来N行，第i行表示第i个节点的信息，每行首先输入一个字符串，该字符串只能是”$and”,”$or”,”ck”的一种，表示该节点的类型。</p>
//<p>如果类型为$and或者$or，则再输入一个正整数k，表示检查的子项节点数目，然后紧跟在这一行继续输入k个正整数，表示该节点的子项。</p>
//<p>如果类型为ck，则再输入两个实数ti、pi，表示运行时间为ti秒，且该项检查有pi的概率为真，1-pi的概率为假。</p>
//<p>输入保证，规则树的入口为1号节点，1号节点是整个规则树的根节点。</p>
public class Main {
}

/*
5
$and 2 2 3
ck 1 0.5
$or 2 4 5
ck 1000 0.5
ck 500 0.5
// out :
501.00

 */
