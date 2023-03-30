package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        var resultMap = new HashMap<Integer, Set<String>>();
        for (var entry : sourceMap.entrySet()) {
            var key = entry.getKey();
            var length = key.length();
            resultMap.computeIfAbsent(length, k -> new HashSet<String>()).add(key);
        }
        return resultMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> sourceMap = new HashMap<>();
        sourceMap.put("one", 1);
        sourceMap.put("two", 2);
        sourceMap.put("three", 3);
        sourceMap.put("five", 4);
        sourceMap.put("ten", 10);

        MapFromKeysCreator creator = new MapFromKeysCreator();
        Map<Integer, Set<String>> resultMap = creator.createMap(sourceMap);

        for (Map.Entry<Integer, Set<String>> entry : resultMap.entrySet()) {
            int length = entry.getKey();
            Set<String> keySet = entry.getValue();
            System.out.printf("%d - %s%n", length, keySet);
        }

    }
}
