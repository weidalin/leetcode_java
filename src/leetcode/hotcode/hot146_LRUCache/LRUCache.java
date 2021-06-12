package leetcode.hotcode.hot146_LRUCache;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
class LRUCache {
    class DLinkedList{
        int key;
        int value;
        DLinkedList prev;
        DLinkedList next;

        public DLinkedList(){

        }
        public DLinkedList(int _key, int _value){
            key = _key;
            value = _value;
        }
    }

    private int size;
    private int capacity;
    private Map<Integer, DLinkedList> map = new HashMap<Integer, DLinkedList>();
    private DLinkedList head, tail;

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.head = new DLinkedList();
        this.tail = new DLinkedList();
        this.head.next = tail;
        this.tail.prev = head;

    }

    public int get(int key) {
        DLinkedList node = map.get(key);
        if(node == null){
            return -1;
        }else{
            moveToHead(node);
            return node.value;
        }

    }

    public void put(int key, int value) {
        DLinkedList node = map.get(key);
        if(node == null){
            node = new DLinkedList(key, value);
            // 添加到DLinkedList 头部
            addToHead(node);
            // 添加到 map中
            map.put(key, node);
            // size ++
            size ++;
            if(size > capacity){
                DLinkedList tail = removeTail();
                //删除哈希表中对应的项
                map.remove(tail.key);
                --size;
            }
        }else{
            // 更新key
            DLinkedList newNode = new DLinkedList(key, value);
            removeNode(node);
            addToHead(newNode);
        }

    }

    public void moveToHead(DLinkedList node){
        removeNode(node);
        addToHead(node);
    }
    public void addToHead(DLinkedList node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    public void removeNode(DLinkedList node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private DLinkedList removeTail() {
        DLinkedList res = tail.prev;
        removeNode(res);
        return res;
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */