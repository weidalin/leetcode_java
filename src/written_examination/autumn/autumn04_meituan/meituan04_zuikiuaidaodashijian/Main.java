package written_examination.autumn.autumn04_meituan.meituan04_zuikiuaidaodashijian;

/**
 * @author linweida
 * 2021/8/15 11:41 上午
 * 小美的最快到达时间
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 小美现在临时接到一个会议通知，需要立刻赶往对应地点开会。
 *
 * 不妨将小美所在的地点抽象成一个图。小美位于节点x的位置，将要赶往节点y开会。
 *
 * 小美启动了打车软件，该打车软件可以将起点定位在任何一个节点开始叫车。但是，叫车是需要时间的，不同位置叫车的等车时间不同。
 *
 * 这就意味着，考虑到叫车的时间，小美可以不选自己所在的节点叫车，而选择一个附近的点叫车，在等车时间内自行走路到对应的节点以缩短综合时间，更快地赶到目的地开会。
 *
 * 请注意：小美的叫车终点只能是开会处，即此题不考虑通过多次打车来缩短时间，只考虑更改起点带来的时间减少。
 *
 *
 *
 * 下面给出一个简单的例子来帮助你理解：
 *
 * 小美位于节点1，开会的地点位于节点3
 *
 * 节点1和节点2之间有一条汽车通行时长为1，步行通行时间为2的通路；
 *
 * 节点2和节点3之间有一条汽车通行时长为2，步行通行时间为5的道路；
 *
 * 节点1的打车等候时间为10，节点2的打车等候时间为1，节点3的打车等候时间为5
 *
 *
 *
 * 此时，显然小美有如下几种方案：
 *
 * 第一种方案：小美在节点1打车，此时小美需要先等时间10上车，之后花费3的时间抵达节点3，共计花费时长13；
 *
 * 第二种方案：小美在节点2打车，此时小美需要步行时长2抵达节点2，此时汽车司机已经等候在节点2，小美直接上车，通行时长2后抵达节点3。共计花费时长为4。
 *
 * 第三种方案：小美直接步行到节点3（因为节点3是开会地点，显然在节点3打车无意义），此时花费的时长为7。
 *
 *
 *
 * 以上三种方案中，应选第二种方案能最快抵达开会地点。共计花费时长为4。
 *
 *
 *
 * 注意：实际打车过程中，司机会存在客人太久没来上车自行取消的可能，这里为了简化问题，我们假设司机耐心是充分的，可以无限制等候乘客。
 *
 *
 *
 * 输入描述
 * 第一行四个正整数n,m,x,y，空格隔开，其中 n 表示点的数量，点的序号依次表示为 1 到 n；m表示边的数量；x表示小美当前的节点位置，y表示小美开会的节点位置。
 *
 * 接下来 m 行，每行四个正整数，空格隔开，x, y, p, q，表示节点 x 和节点 y 之间有一条汽车通行时长 p，步行通行时长 q 的双向道路。
 *
 * 接下来一行 n 个空格隔开的正整数，第 i 个正整数表示在第i个节点打车所需要花费的等车时间。
 *
 * 输出描述
 * 输出一行一个正整数表示小美最快抵达开会地点的时间。
 * 样例输入
 * 3 2 1 3
 * 1 2 1 2
 * 2 3 2 5
 * 10 1 5
 * 样例输出
 * 4
 *
 * 提示
 * 数据范围和说明
 *
 * 对于全体数据保证p和q（即汽车通行时间和步行时间）都是[1, 50]内的正整数，保证每个点打车的等候时间都是[1, 1000]内的正整数
 *
 * 对于n和m，对于60%的数据，保证 1<= n <= 10, 1 <= m <= 30, 对于100%的数据，保证 1<= n <= 50, 1 <= m <= 200，数据保证没有重复的边。
 */

public class Main {
}
