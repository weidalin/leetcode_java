package leetcode.datastructure.hot146_LRUCache;

/**
 * @author linweida
 * 2021/8/19 8:39 下午
 */

public class LRUCache_3_LRUK extends LRUCache{
    private int k;
    private LRUCache historyList; //
    public LRUCache_3_LRUK(int cacheSize, int historyCapacity, int k) {
        super(cacheSize);
        this.k = k;
        this.historyList = new LRUCache(historyCapacity);

    }

    @Override
    public int get(int key) {

        // 记录数据访问次数
        int historyCount = historyList.get(key);
        historyCount = historyCount == -1 ? 0 : historyCount;
        historyList.put(key, ++historyCount);

        return super.get(key);
    }

    @Override
    public void put(int key, int value) {
        // 如果已经在缓存里则直接返回缓存中的数据
        if (super.get(key) != -1) {
            super.put(key, value);;
        }

        // 如果数据历史访问次数达到上限，则加入缓存
        int historyCount = historyList.get(key);
        historyCount = historyCount == -1 ? 0 : historyCount;
        if (historyCount >= k) {
            // 移除历史访问记录
//            historyList.remove(key);
            super.put(key, value);
        }
    }

}
