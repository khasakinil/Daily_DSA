package com.dsa.generic;

import java.util.*;

/**
 * Implement the LRUCache class:
 * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache.
 * If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 * The functions get and put must each run in O(1) average time complexity.
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
 * [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
 * Output
 * [null, null, null, 1, null, -1, null, -1, 3, 4]
 * <p>
 * Explanation
 * LRUCache lRUCache = new LRUCache(2);
 * lRUCache.put(1, 1); // cache is {1=1}
 * lRUCache.put(2, 2); // cache is {1=1, 2=2}
 * lRUCache.get(1);    // return 1
 * lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
 * lRUCache.get(2);    // returns -1 (not found)
 * lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
 * lRUCache.get(1);    // return -1 (not found)
 * lRUCache.get(3);    // return 3
 * lRUCache.get(4);    // return 4
 */
public class LruCache {

    HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
    Deque<Integer> queue = new LinkedList<>();
    int capacity;

    public static void main(String[] args) {
        LruCache lruCache = new LruCache(2);
        lruCache.get(2);
        lruCache.put(2, 6);
        lruCache.get(1);
        lruCache.put(1, 5);
        lruCache.put(1, 2);
        lruCache.get(1);
        lruCache.get(2);
    }

    public LruCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        //update the queue if key already exists else return -1
        if(queue.contains(key)){
            queue.remove(key);
            queue.addFirst(key);
        }
        return cache.get(key) !=null ? cache.get(key) : -1;
    }

    public void put(int key, int value) {
        //check whether queue dont have that key then remove element from the cache and last element from queue
        if (cache.size() == capacity && !queue.contains(key)) {
            cache.remove(queue.getLast());
            queue.removeLast();
        }

        //adding element into cache
        cache.put(key, value);

        //check if key is alredy into the queue, remove if exists and add it to the first place of the queue.
        if(queue.contains(key)){
            queue.remove(key);
        }
        queue.addFirst(key);
    }
}
