package com.rama.app.map;

import java.util.*;

public class MapSamples {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("c", 3);
        map.put("d", 4);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        map.remove("A");
        System.out.println("After remove A");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        Map<String, Integer> map2 = new LinkedHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("c", 3);
        map.put("d", 4);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        map.remove("A");
        System.out.println("After remove A");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        Map<String, Integer> map3 = new TreeMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("c", 3);
        map.put("d", 4);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        map.remove("A");
        System.out.println("After remove A");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        Map<String, Integer> map4 = new Hashtable<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("c", 3);
        map.put("d", 4);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        map.remove("A");
        System.out.println("After remove A");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}