package com.dsa.generic;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Cache {
	int key;
	String value;

	public Cache(int key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
}

public class LRUCacheImplementation {
	static Deque<Integer> queue = new LinkedList<>();
	static Map<Integer, Cache> mapCache = new HashMap<>();
	static int cacheCapacity = 4;

	public String getElementFromCache(int key) {
		if (mapCache.containsKey(key)) {
			Cache currentCache = mapCache.get(key);
			queue.remove(currentCache.key);
			queue.addFirst(currentCache.key);
			return currentCache.value;
		}
		return "Not exists";
	}

	public void putElementInCache(int key, String value) {
		if (mapCache.containsKey(key)) {
			queue.remove(key);
		} else {
			if (queue.size() == cacheCapacity) {
				int temp = queue.removeLast();
				mapCache.remove(temp);
			}
		}
		Cache newCacheItem = new Cache(key, value);
		queue.addFirst(key);
		mapCache.put(key, newCacheItem);
	}

	public static void main(String[] args) {
		LRUCacheImplementation cache = new LRUCacheImplementation();
		cache.putElementInCache(1, "Value_1");
		cache.putElementInCache(2, "Value_2");
		cache.putElementInCache(3, "Value_3");
		cache.putElementInCache(4, "Value_4");
		System.out.println(cache.getElementFromCache(2));
		System.out.println();
		System.out.println(queue);
		System.out.println();
		System.out.println(cache.getElementFromCache(5));
		cache.putElementInCache(5, "Value_5");
		System.out.println();
		System.out.println(queue);
		System.out.println();
	}
}
