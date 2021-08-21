package leetcode.datastructure.hot146_LRUCache;

import java.util.HashMap;
import java.util.Map;

/**
 *


 基于数组
 方案：为每一个数据附加一个额外的属性——时间戳，当每一次访问数据时，更新该数据的时间戳至当前时间。当数据空间已满后，则扫描整个数组，淘汰时间戳最小的数据。
 不足：维护时间戳需要耗费额外的空间，淘汰数据时需要扫描整个数组。


 基于长度有限的双向链表
 方案：访问一个数据时，当数据不在链表中，则将数据插入至链表头部，如果在链表中，则将该数据移至链表头部。当数据空间已满后，则淘汰链表最末尾的数据。
 不足：插入数据或取数据时，需要扫描整个链表。


 基于双向链表和哈希表（这里的实现）
 方案：为了改进上面需要扫描链表的缺陷，配合哈希表，将数据和链表中的节点形成映射，将插入操作和读取操作的时间复杂度从O(N)降至O(1)

 作者：王家麟
 链接：https://juejin.cn/post/6844904049263771662
 来源：掘金
 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
class LRUCache {
    class DLinkedList{
        int key, value;
        DLinkedList next, prev;
        public DLinkedList(){

        }
        public DLinkedList(int key_, int value_){
            key = key_;
            value = value_;
        }
    }
    int capacity, size;
    DLinkedList head, tail;
    HashMap<Integer, DLinkedList> map;

    public LRUCache(int capacity) {
        head = new DLinkedList();
        tail = new DLinkedList();
        head.next = tail;
        tail.prev = head;
        size = 0;
        this.capacity = capacity;
        map = new HashMap<>();
    }

    public int get(int key) {
        DLinkedList node = map.get(key);
        if(node == null){
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedList node = map.get(key);
        if(node == null){
            node = new DLinkedList(key, value);
            map.put(key, node);
            addToHead(node);
            size++;
            if(size > capacity){
                DLinkedList cur_tail = removeTail();
                map.remove(cur_tail.key);
                size--;
            }
        }else{
            removeNode(node);
            node = new DLinkedList(key, value);
            map.put(key, node);
            addToHead(node);
        }

    }
    public void moveToHead(DLinkedList node){
        removeNode(node);
        addToHead(node);
    }
    public void removeNode(DLinkedList node){
        node.next.prev = node.prev;
        node.prev.next = node.next;

    }
    public void addToHead(DLinkedList node){
        head.next.prev = node;
        node.next = head.next;
        node.prev = head;
        head.next = node;
    }
    public DLinkedList removeTail(){
        DLinkedList tail_cur = tail.prev;
        removeNode(tail_cur);
        return tail_cur;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */